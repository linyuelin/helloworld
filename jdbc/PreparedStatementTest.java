package com.dreaMTank.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

@SuppressWarnings("all")
public class PreparedStatementTest {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connection = DriverManager.getConnection(url, user, password);

        //int primary key auto_increment,
        //String sql = "create table admin3 (id int primary key auto_increment,name varchar(32))";
        //String sql = "insert into admin3 values (null,'tom')";
        //String sql = "update admin3 set name = 'king' where id = 1";
        //String sql = "insert into admin3 values (null,'kobe')";
        //String sql = "delete from admin3 where id = 1";
        String sql = "select * from admin3 ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String id = resultSet.getString(1);
            String name= resultSet.getString(2);
            System.out.println(id + "\t" +name ); //  option+| = \
        }

        connection.close();
        preparedStatement.close();
        //System.out.println(rows > 0 ? "完成":"失敗");



    }
}
