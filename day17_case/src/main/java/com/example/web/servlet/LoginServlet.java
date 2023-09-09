package com.example.web.servlet;

import com.example.domain.User;
import com.example.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //キャラクタの設定
        req.setCharacterEncoding("utf-8");
        //リクエスト取得
        String verifycode = req.getParameter("verifycode");

        //検証コード確かめる
        HttpSession session = req.getSession();
        String checkCode = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if (checkCode == null) {


        }
        if(checkCode == null || (!checkCode.equalsIgnoreCase(verifycode))){
            req.setAttribute("error_mes","検証コード間違っています");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        //ユーザー封じ込む
        Map<String, String[]> map = req.getParameterMap();
        User loginUser = new User();
        try {
            try {
                BeanUtils.populate(loginUser,map);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        //サービスでセレクトする
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.findUser(loginUser);
        //成功かどうか判断
        if(user != null){
            session.setAttribute("user",loginUser);
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }else {
            req.setAttribute("error_mes","氏名かパスワードが間違っている、やり直してください");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
