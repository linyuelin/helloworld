package com.example.dao;


import com.example.domain.User;
import com.example.utils.UtilsByDruid;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class User_DAO {

    private JdbcTemplate template = new JdbcTemplate(UtilsByDruid.getDataSource());

    public User login(User loginUser) {
        try {
            String sql = "select * from users where name = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getName(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

}
