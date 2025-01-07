package com.uptoser.springboot.learning.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class BaseTestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "redirect:swagger-ui/index.html";
//        return "Hello World";
    }
//
//    @Autowired
//    Emp user1;
//
//    @Value("${config.browser.url}")
//    String name;
//
//    @ResponseBody
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public Emp main() {
//        user1.setName(this.name);
//        return user1;
//    }
}
