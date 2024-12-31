//package com.uptoser.springboot.learning.config;
//
//import com.google.common.base.Function;
//import com.google.common.base.Optional;
//import com.google.common.base.Predicate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//@Profile("dev")
//public class SwaggerConfig {
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select().apis(SwaggerConfig.basePackage("me.ibeyond"))
//                .paths(PathSelectors.ant("/product/**"))
//                .build().groupName("1-商品接口文档").pathMapping("/")
//                .apiInfo(apiInfo("商品接口文档", "", "1.0.0"));
//
//    }
//
//    @Bean
//    public Docket mainApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select().apis(SwaggerConfig.basePackage("me.ibeyond.springboottest.test,me.ibeyond.springboottest.test2"))
//                .paths(PathSelectors.any())
//                .build().groupName("2-全部接口文档").pathMapping("/")
//                .apiInfo(apiInfo("全部接口文档", "", "1.0.0"));
//
//    }
//
//    private ApiInfo apiInfo(String name, String description, String version) {
//        ApiInfo apiInfo = new ApiInfoBuilder().title(name).description(description).version(version).build();
//        return apiInfo;
//    }
//
//    public static Predicate<RequestHandler> basePackage(final String basePackage) {
//        return new Predicate<RequestHandler>() {
//            @Override
//            public boolean apply(RequestHandler input) {
//                return declaringClass(input).transform(handlerPackage(basePackage)).or(true);
//            }
//        };
//    }
//
//    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
//        return new Function<Class<?>, Boolean>() {
//
//            @Override
//            public Boolean apply(Class<?> input) {
//                for (String strPackage : basePackage.split(",")) {
//                    boolean isMatch = input.getPackage().getName().startsWith(strPackage);
//                    if (isMatch) {
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
//    }
//
//    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
//        return Optional.fromNullable(input.declaringClass());
//    }
//
//}
