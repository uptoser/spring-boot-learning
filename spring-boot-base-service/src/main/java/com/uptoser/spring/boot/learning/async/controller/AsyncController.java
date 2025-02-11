package com.uptoser.spring.boot.learning.async.controller;

import com.uptoser.spring.boot.learning.async.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/async")
    public String async() {
        asyncService.batchAdd();
        return "success";
    }

}
