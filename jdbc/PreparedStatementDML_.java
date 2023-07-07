package com.dreaMTank.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings("all")
public class PreparedStatementDML_ {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
       System.out.println("请输入要删除的管理员的名字～");
       String admin_name = scanner.nextLine();
       // System.out.println("请输入要修改的管理员的密码～");
       // String admin_pwd = scanner.nextLine();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from admin where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,admin_name);
        //preparedStatement.setString(2,admin_pwd);

        int rows = preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();

        System.out.println(rows > 0?"成功":"失败");

    }
}
