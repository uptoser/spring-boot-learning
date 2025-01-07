package com.uptoser.springboot.learning.base.properties.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:browser-settings.properties"})//加载局部配置文件
@ConfigurationProperties(prefix = "config.browser")
public class BrowserSettings {
    private boolean open = false;
    private String execute = "cmd /c start";
    private String url = "http://localhost:8080/springboot";


    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getExecute() {
        return execute;
    }

    public void setExecute(String execute) {
        this.execute = execute;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
