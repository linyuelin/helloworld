package com.example.dao;

import com.example.domain.User;

import java.util.List;
import java.util.Map;

/**
 * ユーザー扱えるDAO
 */
public interface UserDao {
    public List<User> findAll();
    User findUserByUsernameAndPassword(String loginUser, String password);

    void addUser(User user);

    void delUser(int id);

    User findUser(int id);

    void update(User user);

    int findTotalCount(Map<String, String[]> condition);


    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}

