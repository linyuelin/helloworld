package com.dreaMTank.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 使用方式五
 * 创建news表
 *使用jdbc添加5条数据
 * 修改id=1的记录，将content改成一个新的消息
 * 删除id=3的记录
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connection = DriverManager.getConnection(url, user, password);

       // String sql = "create table news (id int primary key auto_increment ,`name` varchar(32) not null default '') ";
              // String sql ="insert into news values(null,'詹姆斯打破贾巴尔得分纪录')";
            //String sql = "update news  set content = '掘金夺冠' where id = 1";
            String sql = "delete from news where id = 3";
                Statement statement = connection.createStatement();
        int cows = statement.executeUpdate(sql);

        statement.close();
        connection.close();

        System.out.println(cows>0?"成功":"失败");
    }
}
