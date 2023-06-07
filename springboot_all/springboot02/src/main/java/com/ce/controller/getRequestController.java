package com.ce.controller;

import com.ce.pojo.dept;
import com.ce.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/company")
public class getRequestController {

    @Autowired
    private deptService deptServiceA;

    @ResponseBody
    @RequestMapping("listdept")
    public List<dept> getDept(){
        return deptServiceA.listall();
    }

    @ResponseBody
    @RequestMapping("findbydept")
    public List<dept> findBydept(@RequestParam(name = "id", required = true) Integer id){
        return deptServiceA.findBydept(id);
    }

    @ResponseBody
    @RequestMapping("changeFilename")
    public String changeFilename(){

        return "message from SpringbootApplication002 is ok";
    }

}
