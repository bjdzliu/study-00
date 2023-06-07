package com.ibmce.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibmce.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    @ResponseBody
    @RequestMapping("testAjax")
    public Pet testAjax(String pname, String page) throws JsonProcessingException {
        Pet pet=new Pet("Tom","cat");
        System.out.println("get from name "+pname);
        System.out.println("get from page"+page);
        return pet;
    }
}


