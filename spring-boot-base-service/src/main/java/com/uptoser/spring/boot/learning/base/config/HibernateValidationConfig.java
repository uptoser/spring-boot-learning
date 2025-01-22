package com.uptoser.spring.boot.learning.base.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


@Configuration
public class HibernateValidationConfig {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        /**默认是普通模式，会返回所有的验证不通过信息集合*/
        MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
        /**设置validator模式为快速失败返回*/
        processor.setValidator(validator());
        return processor;
    }

    @Bean
    public Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                //.addProperty("hibernate.validator.fail_fast", "true")
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        return validator;
    }

}
