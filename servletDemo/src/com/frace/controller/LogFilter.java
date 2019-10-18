package com.frace.controller;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        //获取初始化参数
        String name = filterConfig.getInitParameter("name");
        System.out.println("初始化的参数： " + name);
    }

    @Override
    public void doFilter(ServletRequest request , ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("可以对请求和响应做出过滤");
//        if (request.getParameter("name").equals("frace")) {
//            System.out.println("frace 的请求拦截到了");
//            //将请求传回过滤链
//            chain.doFilter(request, response);
//        } else {
//            System.out.println("其他人的请求被拦截到了");
//            response.setContentType("text/html;charset:UTF-8");
//
//            PrintWriter writer = response.getWriter();
//            writer.write("<h1>其他人的请求拦截到了</h1>");
//
//        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("销毁了 filter。。。。。");
    }

}
