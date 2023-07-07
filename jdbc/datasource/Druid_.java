package com.dreaMTank.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

//测试Druid的使用
public class Druid_ {
    @Test
    public void testDruid() throws Exception {
     //1.加入druid jar包
     //2加入配置文件
     //3.创建properties对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druid.properties"));

        //创建连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
           // System.out.println("连接成功");
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("耗时："+ (end-start));
    }
}
