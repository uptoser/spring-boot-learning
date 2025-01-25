package com.uptoser.spring.boot.learning.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ＠ NacosPropertySource：用于加载dataId为example的配置源，autoRefreshed表示开启自动更新。
 * ＠ NacosValue：设置属性的值，其中info表示key，而Local Hello World代表默认值。也就是说，如果key不存在，则使用默认值。
 */
@NacosPropertySource(dataId = "example",autoRefreshed = true)
@RestController
public class NacosConfigController {

    @NacosValue(value = "${info:Local Hello World}",autoRefreshed = true)
    private String info;

    @GetMapping("/config")
    public String get(){
        return info;
    }
}
