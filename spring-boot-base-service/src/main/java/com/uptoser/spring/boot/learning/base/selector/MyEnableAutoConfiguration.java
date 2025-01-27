package com.uptoser.spring.boot.learning.base.selector;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import({MyAutoConfigurationImportSelector.class})
public @interface MyEnableAutoConfiguration {
}
