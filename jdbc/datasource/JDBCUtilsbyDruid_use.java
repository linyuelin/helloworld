package com.dreaMTank.jdbc.datasource;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCUtilsbyDruid_use {
    public static void main(String[] args) throws Exception {

        String sql = "select * from actor ";
        Connection connection = JDBCUtilsbyDruid.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<actor> list = new ArrayList<actor>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            String phone = resultSet.getString(5);
            list.add(new actor(id, name, sex, date, phone));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t" + list.get(i).getName());
        }

        JDBCUtilsbyDruid.close(null, connection, preparedStatement);
    }
}
