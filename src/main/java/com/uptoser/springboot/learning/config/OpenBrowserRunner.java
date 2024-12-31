//package com.uptoser.springboot.learning.config;
//
//import com.uptoser.springboot.learning.base.model.OpenBrowserSettings;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class OpenBrowserRunner implements CommandLineRunner {
//    private static Logger logger = LoggerFactory.getLogger(OpenBrowserRunner.class);
//
//    @Autowired
//    OpenBrowserSettings openBrowserSettings;
//
//    @Override
//    public void run(String... args) {
//        if (openBrowserSettings.isOpen()) {
//            String execute = openBrowserSettings.getExecute();
//            String url = openBrowserSettings.getUrl();
//            String cmd = execute + " " + url;
//            Runtime run = Runtime.getRuntime();
//            try {
////                run.exec(cmd);
//                logger.info("用浏览器打开地址："+url);
//            } catch (Exception e) {
//                e.printStackTrace();
//                logger.error(e.getMessage());
//            }
//        }
//    }
//}
//
