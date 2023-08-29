package com.example.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.servlet.ServletContext;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class UtilsByDruid {
     private static DataSource dr;

//     static {
//          Properties properties = new Properties();
//          try {
//               properties.load(new FileInputStream("/Users/dreamtank/day14-test2/target/day14-test2-1.0-SNAPSHOT/WEB-INF/classes/druid.properties"));
//               dr = DruidDataSourceFactory.createDataSource(properties);
//          } catch (IOException e) {
//               throw new RuntimeException(e);
//          } catch (Exception e) {
//               throw new RuntimeException(e);
//          }
//     }

//     static {
//          Properties properties = new Properties();
//          try {
//               ClassLoader classLoader = UtilsByDruid.class.getClassLoader();
//               InputStream resourceAsStream = classLoader.getResourceAsStream("druid.properties");
//               if (resourceAsStream == null) {
//                    throw new FileNotFoundException("druid.properties not found");
//               }
//               properties.load(resourceAsStream);
//               dr = DruidDataSourceFactory.createDataSource(properties);
//          } catch (IOException e) {
//               throw new RuntimeException(e);
//          } catch (Exception e) {
//               throw new RuntimeException(e);
//          }
//     }

     static {
          Properties properties = new Properties();
          try {
               InputStream inputStream = UtilsByDruid.class.getClassLoader().getResourceAsStream("druid.properties");
               properties.load(inputStream);
               dr = DruidDataSourceFactory.createDataSource(properties);
          } catch (IOException e) {
               throw new RuntimeException(e);
          } catch (Exception e) {
               throw new RuntimeException(e);
          }
     }



     public static DataSource getDataSource() {
          return dr;
     }

     public static Connection getConnection() {
          try {
               return dr.getConnection();
          } catch (SQLException e) {
               throw new RuntimeException(e);
          }
     }


}