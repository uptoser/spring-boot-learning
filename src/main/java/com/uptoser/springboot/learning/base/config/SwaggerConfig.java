package com.uptoser.springboot.learning.base.config;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
//@EnableSwagger2//swagger2     访问地址：http://项目实际地址/swagger-ui.html
@EnableOpenApi//swagger3.0    http://localhost:8080/swagger-ui/index.html
@Profile("dev")
public class SwaggerConfig implements WebMvcConfigurer {
    // 定义分隔符,配置Swagger多包
    private static final String splitor = ";";
    @Bean
    public Docket createRestApi1() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo("商品接口文档", "", "1.0.0"))
                .host("localhost:8080")
                .select().apis(SwaggerConfig.basePackage("com.uptoser"))
                .paths(PathSelectors.ant("/product/**"))
                .build()
                .groupName("1-商品接口文档").pathMapping("/")
                // 支持的通讯协议集合
//                .protocols(newHashSet("https", "http"))
                // 授权信息设置，必要的header token等认证信息
//                .securitySchemes(securitySchemes())
                // 授权信息全局应用
//                .securityContexts(securityContexts())
                ;

    }

    @Bean
    public Docket createRestApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo("全部接口文档", "", "1.0.0"))
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .groupName("2-全部接口文档").pathMapping("/")
                ;
    }

    /**
     * 页创建该API的基本信息（这些基本信息会展现在文档页面中）
     */
    private ApiInfo apiInfo(String name, String description, String version) {
        return new ApiInfoBuilder()
                .title(name)
                .description(description)
                .version(version)
                .contact(new Contact("联系人","","无"))
                .build();
    }

    /**
     * 重写basePackage方法，使能够实现多包访问
     */
    public static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input->declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
        return input -> {
            // 循环判断匹配
            for (String strPackage : basePackage.split(splitor)) {
                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
                if (isMatch) return true;
            }
            return false;
        };
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }

}
