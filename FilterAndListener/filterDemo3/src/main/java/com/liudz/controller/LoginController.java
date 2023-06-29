package com.liudz.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginController.do")
public class LoginController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.service(req, resp);
        String user= req.getParameter("user");
        String pwd = req.getParameter("pwd");
        System.out.println(user+pwd);
    }
}
