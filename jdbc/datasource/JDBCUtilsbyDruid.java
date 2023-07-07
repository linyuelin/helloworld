package com.dreaMTank.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.dreaMTank.jdbc.ResultSet;


import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtilsbyDruid {

   private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
            ds.getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws Exception {
        Connection connection = ds.getConnection();
        return connection;
    }

    public static void close(ResultSet resultSet, Connection connection, PreparedStatement preparedStatement) {
        try {
            if(connection != null) {
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
