//package com.uptoser.springboot.learning.templatestest.web;
//
//import com.uptoser.springboot.learning.templatestest.model.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//
//@Controller
//public class TemplatesTestController {
//
//    @RequestMapping(value = "/success", method = RequestMethod.GET)
//    public String success(Map<String, Object> map) {
//        map.put("name","Terry Roy");
//        return "success";
//    }
//    @RequestMapping(value = "/header", method = RequestMethod.GET)
//    public String header(Map<String, Object> map) {
//        return "header";
//    }
//    @RequestMapping("/study")
//    public String study(Map<String, Object> map, HttpServletRequest request) {
//        List<User> userList = new ArrayList<>();
//        userList.add(new User("小梦", 1));
//        userList.add(new User("小李", 2));
//        userList.add(new User("小张", 1));
//
//        map.put("userList", userList);
//
//        //1 女， 2 男
//        map.put("sex", 2);//
//        map.put("man", 2);//
//
//        map.put("desc", "欢迎来到<h1>梦学谷</h1>");
//
//        //将user对象绑定到session中
//        request.getSession().setAttribute("user", new User("小刘", 2));
//
//        return "study";
//    }
//
//}
