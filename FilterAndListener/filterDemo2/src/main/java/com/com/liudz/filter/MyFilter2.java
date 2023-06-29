package com.com.liudz.filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("in doFilter， Myfilter2  在过滤请求");
        //放行请求，如果有，就传递给目标资源
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Myfilter2  在过滤响应");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
