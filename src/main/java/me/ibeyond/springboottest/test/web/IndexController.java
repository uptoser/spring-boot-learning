package me.ibeyond.springboottest.test.web;

import me.ibeyond.springboottest.config.UserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserSettings userSettings;
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;


    @RequestMapping("/")
    String index() {
        return "new 你的书名叫:" + bookName + "\n作者叫:" + bookAuthor + userSettings.getAge();
    }
}
