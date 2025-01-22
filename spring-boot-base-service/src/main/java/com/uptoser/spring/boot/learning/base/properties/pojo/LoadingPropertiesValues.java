package com.uptoser.spring.boot.learning.base.properties.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
@ConfigurationProperties(prefix = "property-values")
@Data
//@Validated
public class LoadingPropertiesValues {
    private int age;
    private String email;
    Map<String,String> map;
    List<String> list;
}
