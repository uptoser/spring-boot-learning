package com.uptoser.springboot.learning.base.controller;

import com.uptoser.springboot.learning.base.properties.vo.LoadingPropertiesValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class BaseTestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/swagger-ui/index.html";
//        return "Hello World";
    }

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Autowired
    LoadingPropertiesValues values;

    @ResponseBody
    @RequestMapping(value = "/values", method = RequestMethod.GET)
    public Map<String,Object> values() {
        Map<String,Object> map = new HashMap<>();
        map.put("values",values);
        map.put("contextPath",contextPath);
        return map;
    }
}
