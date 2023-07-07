package com.dreaMTank.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * jdbc程序 完成简单操作
 */
public class jdbc01 {
    public static void main(String[] args) throws SQLException {

        // 前置工作： 引入jar文件
        //1, 注册驱动
        Driver driver = new Driver();

        //2， 得到链接
        String url  = "jdbc:mysql://localhost:3306/hsp_db01";
        //将用户名和密码放到properties文件
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","LX1112223334");

        Connection connect = driver.connect(url, properties);

        //3，执行sql

        //String sql = "insert into actor values(null,'刘德华','男','1970-11-11','110')";
        //String sql = "update actor set name =  '周星驰'  where id = 1";
        String sql = "delete from actor where id = 1";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);

        System.out.println(rows > 0? "成功":"失败");

        //4，关闭连接
         statement.close();
         connect.close();

    }
}
