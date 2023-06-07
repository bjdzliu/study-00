package com.ibmce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pathController {

    @RequestMapping("/testPathVariable/{id}/{username}")
    public String testPathVariable(@PathVariable("id") String id,@PathVariable("username") String username){
        System.out.println("testpathvariable1");
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

}
