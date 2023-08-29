package com.example.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        一。获取所有头
//        Enumeration<String> headerNames = req.getHeaderNames();
//        while(headerNames.hasMoreElements()){
//            String name = headerNames.nextElement();
//            String header = req.getHeader(name);
//            System.out.println(name + "--" +header);

//        二。分别获取
        String agent = req.getHeader("user-agent");
        if(agent.contains("Chrome")){
            System.out.println("google");
        } else if (agent.contains("Safari")) {
            System.out.println("Safari");
            
        }

    }
}



