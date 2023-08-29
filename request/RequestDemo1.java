package com.example.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     /*
        1．获取请求方式：GET
                * string getMethod()
        2。（*)获取虛拟目录：/day14
                * string getContextPath ()
        3．获取servlet路径：/demo1
                * String getServletPath ()
        4. 荻取get方式清求参数：name=zhangsan
                * String getQuerystring()
        5.（*）获取请求URI :/day14/ demo1
                * String getRequestURI() :
          /day14/demo1
                * stringBuffer getRequestURL() :http://localhost/day14/demo1
        6．获取协议及版本：HTTP/1.1
                * String getprotocol()
        7．获取客户机的IP地址：
                * String getRemoteAddr()
        */
        String method = req.getMethod();
        System.out.println(method);

        String contextPath = req.getContextPath();
        System.out.println(contextPath);

        String servletPath = req.getServletPath();
        System.out.println(servletPath);

        String queryString = req.getQueryString();
        System.out.println(queryString);

        String requestURI = req.getRequestURI();
        System.out.println(requestURI);

        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);

        String protocol = req.getProtocol();
        System.out.println(protocol);

        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);


    }
}
