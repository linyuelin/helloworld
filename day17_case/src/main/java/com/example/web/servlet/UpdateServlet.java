package com.example.web.servlet;

import com.example.domain.User;
import com.example.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //チャラクタの設定
        req.setCharacterEncoding("utf8");
        //リクエスト取得
        Map<String, String[]> map = req.getParameterMap();

        //userオブジェクトに入れる
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        //serviceでアップデート
        UserServiceImpl userService = new UserServiceImpl();
        userService.updateUser(user);
        //userListServletにジャンプ
        resp.sendRedirect(req.getContextPath()+"/userListServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
