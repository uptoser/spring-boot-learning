package com.uptoser.spring.boot.learning;

import com.uptoser.spring.boot.learning.api.service.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @SpringBootApplication 用于标识 一个引导类，说明 当前是一个 SpringBoot项目
 *    @SpringBootConfiguration 用于定义一个 SpringBoot 的配置类（配置类等同配置文件）
 *        @Configuration 它属于spring中的一个注解, 定义配置类, 等价于配置文件
 *            @Component 添加到spring容器中,表示 是一个组件
 *
 *    @EnableAutoConfiguration 告诉 SpringBoot 开启自动配置功能，这样 SpringBoot 会自动根据你导入的依jar包来自动配置项目
 *        @AutoConfigurationPackage 将引导类所在包及其子包下面所有的组件添加 到spring 容器中
 *            @Import({AutoConfigurationPackages.Registrar.class})
 *            会将引导类（@SpringBootApplication标注的类）所在的包及下面所有子包里面的所有组件扫描到Spring容器
 *        @Import({AutoConfigurationImportSelector.class})
 *        1. 将所有组件以全类名的方式返回,并且 添加 到spring 容器中
 *        2. 会给容器中导入非常多的自动 配置类(*****AutoConfiguration),就是导入并配置好很多当前项目中所有需要的组件,
 *        省去我们手动编写配置然后注入到组件中
 *
 *    @ComponentScan 被该 注解 标识的类,会被spring容器进行管理.
 */

@SpringBootApplication
//@ImportResource({"classpath:spring-dataSource.xml"})
//mapperScan扫描到其他组件有可能会出现多个bean存在的情况： required a single bean, but 2 were found
@MapperScan(value = "com.uptoser.spring.boot.learning.*.mapper")
//@ComponentScan(value = "com.uptoser")

public class SpringbootApplication {

//    @DubboReference(url = "dubbo://192.168.3.11:20880/com.uptoser.spring.boot.learning.api.service.IHelloService")
//    private IHelloService helloService;
//
//    @Bean
//    public ApplicationRunner runner(){
//        return args -> System.out.println(helloService.sayHello("Mic"));
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
