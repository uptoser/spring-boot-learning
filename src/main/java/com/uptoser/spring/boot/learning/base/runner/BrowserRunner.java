package com.uptoser.spring.boot.learning.base.runner;

import com.uptoser.spring.boot.learning.base.properties.vo.BrowserSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * CommandLineRunner 是 Spring Boot 中的一个接口，用于在 Spring 应用程序启动时执行特定的代码。
 * 实现 CommandLineRunner 接口的类可以在应用程序启动完成之后立即运行一些初始化任务或者执行特定的操作。
 */
@Component
public class BrowserRunner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(BrowserRunner.class);

    @Autowired
    BrowserSettings openBrowserSettings;

    @Override
    public void run(String... args) {
        if (openBrowserSettings.isOpen()) {
            String execute = openBrowserSettings.getExecute();
            String url = openBrowserSettings.getUrl();
            String cmd = execute + " " + url;
            Runtime run = Runtime.getRuntime();
            try {
//                run.exec(cmd);
                logger.info("用浏览器打开地址："+url);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}

