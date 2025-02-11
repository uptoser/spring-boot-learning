package com.uptoser.spring.boot.learning;

import com.uptoser.spring.boot.learning.api.service.IHelloService;
import com.uptoser.spring.boot.learning.base.selector.ImportSelectorTestEntity1;
import com.uptoser.spring.boot.learning.base.selector.MyEnableAutoConfiguration;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.mybatis.spring.annotation.MapperScan;
import org.redisson.api.RedissonClient;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

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
 *              - 会将引导类（@SpringBootApplication标注的类）所在的包及下面所有子包里面的所有组件扫描到Spring容器
 *        @Import({AutoConfigurationImportSelector.class})
 *          - 1. 将所有组件以全类名的方式返回,并且 添加 到spring 容器中
 *          - 2. 会给容器中导入非常多的自动 配置类(*****AutoConfiguration),就是导入并配置好很多当前项目中所有需要的组件,省去我们手动编写配置然后注入到组件中
 *        AutoConfigurationImportSelector.class
 *          - AutoConfigurationMetadataLoader.loadMetadata从META-INF/spring-autoconfigure-metadata.properties中加载自动装配的条件元数据
 *              它的作用和＠Conditional是一样的，只是将这些条件配置放在了配置文件中
 *          - 收集所有符合条件的配置类getAutoConfigurationEntry(annotationMetadata).getConfigurations()，完成自动装配
 *              它主要做几件事情：
 *              • getAttributes获得＠EnableAutoConfiguration注解中的属性exclude、excludeName等。
 *              • getCandidateConfigurations获得所有自动装配的配置类 (重点)
 *                - getCandidateConfigurations用到了SpringFactoriesLoader，它是Spring内部提供的一种约定俗成的加载方式，类似于Java中的SPI
 *                  简单来说，它会扫描classpath下的META-INF/spring.factories文件
 *                  SpringFactoriesLoader.loadFactoryNames会根据Key得到对应的value值
 *                  Key对应为EnableAutoConfiguration，Value是多个配置类，也就是getCandidateConfigurations方法所返回的值
 *              • removeDuplicates去除重复的配置项。
 *              • getExclusions根据＠EnableAutoConfiguration注解中配置的exclude等属性，把不需要自动装配的配置类移除。
 *              • fireAutoConfigurationImportEvents广播事件。
 *              • 最后返回经过多层判断和过滤之后的配置类集合。
 *
 *    @ComponentScan 被该 注解 标识的类,会被spring容器进行管理.
 *
 *    自动装配的原理，简单来总结一下核心过程：
 *    • 通过＠Import（AutoConfigurationImportSelector）实现配置类的导入，但是这里并不是传统意义上的单个配置类装配。
 *    • AutoConfigurationImportSelector类实现了ImportSelector接口，重写了方法selectImports，它用于实现选择性批量配置类的装配。
 *    • 通过Spring提供的SpringFactoriesLoader机制，扫描classpath路径下的META-INF/spring.factories，读取需要实现自动装配的配置类。
 *    • 通过条件筛选的方式，把不符合条件的配置类移除，最终完成自动装配。
 */

@SpringBootApplication
@MyEnableAutoConfiguration //自定义的注解，为了模拟 @EnableAutoConfiguration
//@ImportResource({"classpath:spring-dataSource.xml"})
//mapperScan扫描到其他组件有可能会出现多个bean存在的情况： required a single bean, but 2 were found
@MapperScan(value = "com.uptoser.spring.boot.learning.*.mapper")
//@ComponentScan(value = "com.uptoser")
@EnableScheduling //开启注解版的定时任务
@EnableAsync //开启基于注解版的异步处理
public class SpringbootApplication {

//    @DubboReference(url = "dubbo://192.168.3.11:20880/com.uptoser.spring.boot.learning.api.service.IHelloService")
//    private IHelloService helloService;
//
//    @Bean
//    public ApplicationRunner runner(){
//        return args -> System.out.println(helloService.sayHello("Mic"));
//    }

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(SpringbootApplication.class, args);
        //获取通过@MyEnableAutoConfiguration注解注入的Bean
        ImportSelectorTestEntity1 bean = cac.getBean(ImportSelectorTestEntity1.class);
        System.out.println("通过自定义批量扫描获取的Bean Name为： "+bean.getClass().getName());
        //Mystart RedissonClient
        System.out.println(cac.getBean(RedissonClient.class).getId());
    }
}
