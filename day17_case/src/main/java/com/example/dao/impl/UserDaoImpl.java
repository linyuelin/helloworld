package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //JDBCによってデーターベースを操作する

        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String loginUser, String password) {
        try {
            String sql = "select * from user where username = ? and password = ? ";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), loginUser, password);

            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addUser(User user) {
        String sql = "insert into user values (null,?,?,?,?,?,?,null,null)";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void delUser(int id) {
        String sql = "delete from user where id =?";
        template.update(sql, id);
    }

    @Override
    public User findUser(int id) {
        String sql = "select * from user where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?, gender = ?,age = ?, address = ?,qq =?,email = ? where id = ? ";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        //sql見本
        String sql = "select count(*) from user where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        //map
        Set<String> keySet = condition.keySet();
        //パラメータの集合
        List<Object> params = new ArrayList<Object>();

        for (String key : keySet) {
            //currentと rowsにイコールか判断
            if("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }
            //バリューの取得
           String value = condition.get(key)[0];
           //バリューの有無を判断
           if(value != null && !"".equals(value)){
              sb.append(" and " + key + " like  ? "  ) ;
              params.add("%" + value +"%");
           }
        }
        System.out.println(sb.toString());
        System.out.println(params);
        return template.queryForObject(sb.toString(), Integer.class,params.toArray());
    }

    @Override
    public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from user where 1 = 1";
        StringBuilder sb = new StringBuilder(sql);
        //map
        Set<String> keySet = condition.keySet();
        //パラメータの集合
        List<Object> params = new ArrayList<Object>();

        for (String key : keySet) {
            //currentと rowsにイコールか判断
            if("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }
            //バリューの取得
            String value = condition.get(key)[0];
            //バリューの有無を判断
            if(value != null && !"".equals(value)){
                sb.append(" and " + key + " like  ? "  ) ;
                params.add("%" + value +"%");
            }
        }
       sb.append(" limit ? , ? ");
        params.add(start);
        params.add(rows);

        System.out.println(sql);
        System.out.println(params);
        List<User> list = template.query(sb.toString() ,new BeanPropertyRowMapper<User>(User.class),params.toArray());
        return list;
    }


}




