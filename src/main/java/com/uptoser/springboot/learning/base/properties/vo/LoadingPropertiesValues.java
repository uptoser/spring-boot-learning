package com.uptoser.springboot.learning.base.properties.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
//@ConfigurationProperties(prefix = "user")
@ConfigurationProperties(prefix = "property-values")
//@PropertySource("classpath:/config/user.properties")
//@PropertySource(value = {"classpath:emp.properties"})
//@Validated
public class LoadingPropertiesValues {

    private int age;
//    @Email
    private String email;

    Map<String,String> map;

    List<String> list;

//    Set<Integer> set;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

//    public Set<Integer> getSet() {
//        return set;
//    }
//
//    public void setSet(Set<Integer> set) {
//        this.set = set;
//    }
}
