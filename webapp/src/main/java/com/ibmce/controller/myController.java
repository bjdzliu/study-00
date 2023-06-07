package com.ibmce.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//
//@WebServlet("/myServlet.do")
//public class myServlet extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//        req.getRequestDispatcher("first.jsp").forward(req,resp);
//    }
//}


@Controller
public class myController  {
//    @RequestMapping("/firstController.do")
//    public String firstController(){
//        System.out.println("this is firstController");
//        return "/first.jsp";
//    }
@Value("${apikey}")
private String APIKEY;

    @RequestMapping(value = "/testRequest", method={RequestMethod.GET,RequestMethod.POST})
    public String testRequest(){
        System.out.println("testRequest");
        return "success";
    }

    @RequestMapping("/myCon.do")
    public String success(){
        System.out.println("this is sucess");
        System.out.println(APIKEY);
        //视图解析器
        return "success";
    }
}




