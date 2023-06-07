package com.ibmce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paraController {

    @RequestMapping("/getParamByArgName.do")
    public String getParam2(String username, String password){
        System.out.println("username:"+username+"   password:"+password);
        return "getParaSuccess";

    }

}
