package com.dreaMTank.jdbc;


import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//java链接masql的五种方式
public class jdbcConn {
    // 方式一
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/hsp_db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","LX1112223334");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    //方式二
    @Test
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //使用反射加载driver类
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","LX1112223334");
        Connection connect = driver.connect(url, properties);

        System.out.println(connect);

    }
    // 使用driverManager
     @Test
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //使用反射加载driver
         Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
         Driver driver = (Driver) aClass.newInstance();

         //创建url，user，password
          String url = "jdbc:mysql://localhost:3306/hsp_db01";
          String user = "root";
          String password = "LX1112223334";

         DriverManager.registerDriver(driver);
         Connection connection = DriverManager.getConnection(url, user, password);
         System.out.println(connection);

     }
     //第四种
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db01";
        String user = "root";
        String password = "LX1112223334";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

    }

    //方式5 增加配置文件
    @Test
    public void connect05() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }



}
