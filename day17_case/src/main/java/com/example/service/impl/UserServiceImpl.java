package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import com.example.domain.PageBean;
import com.example.domain.User;
import com.example.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //Daoによってセレクト
        return dao.findAll();
    }

    @Override
    public User findUser(User loginUser) {
        return dao.findUserByUsernameAndPassword(loginUser.getUsername(), loginUser.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void delUser(String id) {
        dao.delUser(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findUser(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelected(String[] uids) {
        if (uids != null && uids.length > 0) {
            for (int i = 0; i < uids.length; i++) {
                dao.delUser(Integer.parseInt(uids[i]));
            }
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        //変数をかえる
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <= 0){
            currentPage=1;
        }

        //pageBeanに追加
        PageBean<User> pb = new PageBean<User>();
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //daoで総件数セレクト
        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);


        //totalPage
        int totalPage = (totalCount % rows) == 0 ? (totalCount / rows) : (totalCount / rows + 1);

        if(currentPage > totalPage){
            currentPage=totalPage;
        }

        pb.setTotalPage(totalPage);
        //daoでlist集合セレクト
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start,rows,condition);
        pb.setList(list);


        return pb;
    }
}
