package com.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(filterName="com.liudz.hello",urlPatterns={"/*"})
public class UserFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(UserFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, IOException {
        logger.info("请求处理");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        简单的session校验
        if (request.getSession().getAttribute("user")!=null) {
            //        请求放行
            filterChain.doFilter(request, response);
        }else {

        }

    }

    @Override
    public void destroy() {
        logger.info("销毁");
    }
}