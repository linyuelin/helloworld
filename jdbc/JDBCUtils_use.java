package com.dreaMTank.jdbc;

import org.junit.jupiter.api.Test;

import javax.swing.text.Utilities;
import java.sql.*;
import java.sql.ResultSet;

//演示jdbc工具类的使用
public class JDBCUtils_use {
    public static void main(String[] args) throws SQLException {

        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection.getClass());
        //String sql = "update actor set name = ?  where id = ?";
        String sql = "select * from actor";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
       // preparedStatement.setString(1,"tom");
       // preparedStatement.setInt(2,1);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }
        // int rows = preparedStatement.executeUpdate();
        JDBCUtils.close(null,connection,preparedStatement);


    }
}
