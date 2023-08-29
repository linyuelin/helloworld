package com.example.web;

import com.example.dao.User_DAO;
import com.example.domain.User;
import com.example.utils.UtilsByDruid;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class login extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        ServletContext context = getServletContext();
//        String propertiesPath = context.getRealPath("/WEB-INF/classes/druid.properties");
//        System.out.println(propertiesPath);
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        User loginuser = new User();
        loginuser.setName(name);
        loginuser.setPassword(password);

        User_DAO userDao = new User_DAO();
        User user = userDao.login(loginuser);

        if(user == null){
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else {
            req.setAttribute("name",name);
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
