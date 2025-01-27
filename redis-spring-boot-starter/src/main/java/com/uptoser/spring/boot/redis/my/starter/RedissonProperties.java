package com.uptoser.spring.boot.redis.my.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@ConfigurationProperties(prefix = "starter.redisson")
public class RedissonProperties {

    private String host = "192.168.3.200";
    private String password;
    private int port = 6379;
    private int timeout;
    private boolean ssl;

    public String getHost() {return host;}
    public void setHost(String host) {this.host = host;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public int getPort() {return port;}
    public void setPort(int port) {this.port = port;}
    public boolean isSsl() {return ssl;}
    public void setSsl(boolean ssl) {this.ssl = ssl;}
    public int getTimeout() {return timeout;}
    public void setTimeout(int timeout) {this.timeout = timeout;}
}
