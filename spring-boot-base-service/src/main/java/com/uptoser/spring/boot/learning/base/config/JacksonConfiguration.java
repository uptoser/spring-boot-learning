package com.uptoser.spring.boot.learning.base.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

/**
 * 在Spring Boot中，针对＠Conditional做了扩展，提供了更简单的使用形式，扩展注解如下：
 * • ConditionalOnBean/ConditionalOnMissingBean：容器中存在某个类或者不存在某个Bean时进行Bean装载。
 * • ConditionalOnClass/ConditionalOnMissingClass：classpath下存在指定类或者不存在指定类时进行Bean装载。
 * • ConditionalOnCloudPlatform：只有运行在指定的云平台上才加载指定的Bean。
 * • ConditionalOnExpression：基于SpEl表达式的条件判断。
 * • ConditionalOnJava：只有运行指定版本的Java才会加载Bean。
 * • ConditionalOnJndi：只有指定的资源通过JNDI加载后才加载Bean。
 * • ConditionalOnWebApplication/ConditionalOnNotWebApplication：如果是Web应用或者不是Web应用，才加载指定的Bean。
 * • ConditionalOnProperty：系统中指定的对应的属性是否有对应的值。
 * • ConditionalOnResource：要加载的Bean依赖指定资源是否存在于classpath中。
 * • ConditionalOnSingleCandidate：只有在确定了给定Bean类的单个候选项时才会加载Bean。
 */
@Configuration
public class JacksonConfiguration {
    @Bean
    @ConditionalOnProperty("spring.jackson.date-format")
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer(@Value("${spring.jackson.date-format}") String pattern) {
        return builder -> {
            //Json格式化LocalDateTime配置
            DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern(pattern);
            builder.serializers(new LocalDateTimeSerializer(dateTimeFormatter));
            builder.deserializers(new LocalDateTimeDeserializer(dateTimeFormatter));
        };
    }
}
