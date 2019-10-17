package com.frace.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloController extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message="进入 servlet init().....";
        super.init();//如果不继承父类方法，那么就会调用一次实现一次
    }

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        //处理中文
        String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
        //设置逻辑实现
        PrintWriter printer=response.getWriter();
        String docType = "<!DOCTYPE html> \n";
        printer.write(docType +
                "<html>\n" +
                "<head><title>" + "show" + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + name + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + name + "\n" +
                "  <li><b>网址</b>："
                + request.getParameter("url") + "\n" +
                "</ul>\n" +
                "</body></html>");
//        printer.write("<h1>"+name+"</h1>");
        destroy();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    public void destroy(){
        System.out.println("销毁了    servlet......");
        super.destroy();
    }

}
