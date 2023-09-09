package com.example.web.servlet;

import com.example.domain.PageBean;
import com.example.domain.User;
import com.example.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPage")
public class FindUserByPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        // レクエスト取得
        String currentPage = req.getParameter("currentPage");
        String rows = req.getParameter("rows");

        if(currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        if(rows == null || "".equals(rows)){
            rows = "5";
        }
        Map<String, String[]> condition = req.getParameterMap();


        //serviceでセレクト
        UserServiceImpl userService = new UserServiceImpl();
        PageBean<User> pb = userService.findUserByPage(currentPage,rows,condition);
        //pageBeanオブジェクト設定
        req.setAttribute("pb",pb);
        req.setAttribute("condition",condition);//セレクト条件
        //list.jspに発信
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
