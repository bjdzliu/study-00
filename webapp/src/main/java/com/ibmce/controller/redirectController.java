package com.ibmce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class redirectController {
    @RequestMapping("/redirctByArgName.do")
    public String getParam3(String username, String password){
        System.out.println("username:"+username+"   password:"+password);
        return "redirect:/redirect.jsp";
    }

    @RequestMapping("/demo5")
    public ModelAndView testDemo5(HttpServletRequest req){
        ModelAndView mv = new ModelAndView();
        //请求转发

        //请求重定向
        mv.setViewName("redirect:/redirect.jsp");
        //mv.setView(new RedirectView(req.getContextPath()+"/redirect.jsp"));
        return mv;
    }

}
