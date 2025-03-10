package com.uptoser.spring.boot.learning.dubbo.provider;

import com.uptoser.spring.boot.learning.api.service.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        System.out.printf("The message received is [%s]\n",name);
        return String.format("[%s]：Hello,%s",serviceName,name);
    }

}
