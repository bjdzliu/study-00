package com.ce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @ResponseBody
    @RequestMapping("firstController")
    public String firstController(){
        return "hello world";
    }

}
