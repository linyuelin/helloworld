package com.dreaMTank.jdbc;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings("all")
public class PreparedStatement_ {
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

        String sql = "select name,pwd from admin where name = ? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("登陆成功～");

        }else {
            System.out.println("登陆失败～");
        }

        resultSet.close();

        preparedStatement.close();
        connection.close();

    }
}

