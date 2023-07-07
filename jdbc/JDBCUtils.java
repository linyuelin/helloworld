package com.dreaMTank.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

// 工具类，连接和关闭
public class JDBCUtils {
    public static String user;
    public static String password;
    public static String url;
    public static String driver;


    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/mysql.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public static void close(ResultSet resultSet, Connection connection, Statement statement){
        try {
            if(connection != null){
                connection.close();
            }

            if(statement != null){
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
