package com.example.test;

import com.example.dao.User_DAO;
import com.example.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin(){
        User user = new User();
        user.setName("james");
        user.setPassword("666");
        User_DAO userDao = new User_DAO();
        User login = userDao.login(user);
        System.out.println(login);
    }
}
