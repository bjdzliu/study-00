package com.com.liudz.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter(urlPatterns = "/myServlet1.do",initParams = {@WebInitParam(name="realname",value="jack"),@WebInitParam(name="charset",value="uft-8")})
public class MyFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("in doFilter， Myfilter1  在过滤请求");

        //放行请求，如果有，就传递给目标资源
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Myfilter1  在过滤响应");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       String realname= filterConfig.getInitParameter("realname");
       System.out.println("realname: "+realname);

        Enumeration<String> pNames = filterConfig.getInitParameterNames();
        while(pNames.hasMoreElements()){
            String pName = pNames.nextElement();
            System.out.println(pName+": "+filterConfig.getInitParameter(pName));
        }


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
