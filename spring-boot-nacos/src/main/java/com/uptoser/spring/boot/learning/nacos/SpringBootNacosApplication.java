package com.uptoser.spring.boot.learning.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosApplication.class, args);
        /*
        通过Nacos提供的Open API，向Nacos Server注册一个名字为spring-boot-nacos的服务。
        curl -X PUT 'http://192.168.3.200:8848/nacos/v1/ns/instance?serviceName=spring-boot-nacos&ip=127.0.0.1&port=8080'
         */
        System.out.println("http://localhost:8080/discovery?serviceName=spring-boot-nacos");
        System.out.println("http://localhost:8080/config");
    }
}
