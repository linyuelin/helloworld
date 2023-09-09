package com.example.web.servlet;

import com.example.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedServlet")
public class DelSelectedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //キャラクタの設定
        req.setCharacterEncoding("utf8");
        // リクエスト取得
        String[] uids = req.getParameterValues("uid");
        //serviceで削除
        UserServiceImpl userService = new UserServiceImpl();
        userService.delSelected(uids);
        //userListServletへジャンプ
        resp.sendRedirect(req.getContextPath()+"/userListServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
