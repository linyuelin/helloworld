package com.dreaMTank.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings("all")
public class statement_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员名字： ");
        String admin_name = scanner.nextLine();
        System.out.println("请输入管理员密码： ");
        String admin_pwd = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select name,pwd from admin where name = '" + admin_name + " ' and pwd = '" + admin_pwd + "'";
        Statement statement = connection.createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            System.out.println("登陆成功～");

        }else {
            System.out.println("登陆失败～");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}

