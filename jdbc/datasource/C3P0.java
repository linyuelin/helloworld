package com.dreaMTank.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//演示C3P0的使用
public class C3P0 {


    //第一种
    @Test
    public void testC3P0_01() throws IOException, PropertyVetoException, SQLException {

        //创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        //通过配置文件获取相关信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源设置相关参数
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);


        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        comboPooledDataSource.setMaxPoolSize(50);

        //测试连接5000次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i <5000 ; i++) {
        Connection connection = comboPooledDataSource.getConnection();
       // System.out.println("连接成功");
        connection.close();}

        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    //第二种 ： 使用配置文件
    @Test
    public void testC3P0() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("dreamTank");
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            //System.out.println("连接成功～");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
