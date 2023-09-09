package com.example.service;

import com.example.domain.PageBean;
import com.example.domain.User;

import java.util.List;
import java.util.Map;

/**
 * ユーザー管理のインタフェース
 */
public interface UserService {

    /**
     * すべてのユーザー情報をセレクトする
     *
     * @return
     */
    public List<User> findAll();

    User findUser(User user);


    void addUser(User user);

    void delUser(String id);

    User findUserById(String id);

    void updateUser(User user);

    void delSelected(String[] uids);


    PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition);
}
