package com.kdgc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}