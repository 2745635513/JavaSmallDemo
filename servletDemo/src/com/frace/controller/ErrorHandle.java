package com.frace.controller;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ErrorHandle")
public class ErrorHandle extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取cookie
        Cookie[] cookies=request.getCookies();
        Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
        Integer code = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String name = (String) request.getAttribute("javax.servlet.error.servlet_name");
        if (name == null) {
            name = "unknown";
        }
        String url = (String) request.getAttribute("javax.servlet.error.request_uri");
        if (url == null) {
            url = "unknown";
        }
        response.setContentType("text/html;charset=UTF-8");
        //设置cookie
        Cookie cookie = new Cookie("name", "frace");
        cookie.setMaxAge(60*1);
        response.addCookie(cookie);

        PrintWriter writer = response.getWriter();
        String html = "<!DOCTYPE html> \n";
        writer.println(html +
                "<html>\n" +
                "<head><title>show error page </title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n");
        //展示cookie信息
        for (Cookie currenCookie:
             cookies) {
            if (currenCookie.getName().compareTo("name") ==0){
                currenCookie.setMaxAge(0);//删除
                response.addCookie(currenCookie);
                writer.write("删除 name");
            }else {

                writer.write(" cookie name is :" +currenCookie.getName()+",cookie value is :" +currenCookie.getValue()+"<br/> maxage is" +currenCookie.getMaxAge());
            }
        }
        writer.write("<h1>错误展示</h1>");
        if (throwable == null && code == null) {
            writer.println("<h2>错误信息丢失</h2>");
            writer.println("请返回 <a href=\"" +
                    response.encodeURL("http://localhost:8090/hello") +
                    "\">hello</a>。");
        } else if (code != null) {
            writer.println("错误编码： " + code);
        } else {
            writer.println("servlet name is " + name + "<br/> 异常类型 ：" + throwable.getClass().getName() + "<br/> 异常地址： " + url);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
