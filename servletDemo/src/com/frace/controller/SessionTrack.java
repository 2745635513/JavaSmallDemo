package com.frace.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SessionTrack extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //创建一个session
        HttpSession session = request.getSession(true);
        //session的创建时间
        Date createTime = new Date(session.getCreationTime());
        //session的最后访问时间
        Date lastTime = new Date(session.getLastAccessedTime());
//时间格式转化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //访问量
        int visitNum=0;
        //访问量的key
        String visitNumKey=new String("visitNum");
        //
        String userIdKey=new String("userId");
        String userId=new String("frace_27");
        if (session.getAttribute(visitNumKey)==null){
            session.setAttribute(visitNumKey,0);
        }
        //检查新的访问
        if (session.isNew()){
            session.setAttribute(userIdKey,userId);
        }else {
            visitNum= (int) session.getAttribute(visitNumKey);
            visitNum+=1;
            userId= (String) session.getAttribute(userIdKey);
        }
        session.setAttribute(visitNumKey,visitNum);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer=response.getWriter();

        String docType = "<!DOCTYPE html>\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + "show session" + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + "show session" + "</h1>\n" +
                "<h2 align=\"center\">Session 信息</h2>\n" +
                "<table border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "  <th>Session 信息</th><th>值</th></tr>\n" +
                "<tr>\n" +
                "  <td>id</td>\n" +
                "  <td>" + session.getId() + "</td></tr>\n" +
                "<tr>\n" +
                "  <td>创建时间</td>\n" +
                "  <td>" +  sdf.format(createTime) +
                "  </td></tr>\n" +
                "<tr>\n" +
                "  <td>最后访问时间</td>\n" +
                "  <td>" + sdf.format(lastTime) +
                "  </td></tr>\n" +
                "<tr>\n" +
                "  <td>用户 ID</td>\n" +
                "  <td>" + userId +
                "  </td></tr>\n" +
                "<tr>\n" +
                "  <td>访问统计：</td>\n" +
                "  <td>" + visitNum + "</td></tr>\n" +
                "</table>\n" +
                "</body></html>");

    }
}
