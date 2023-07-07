package com.dreaMTank.jdbc.transaction_;

import com.dreaMTank.jdbc.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.*;

//演示事务解决问题
@SuppressWarnings("all")
public class Transaction_ {

    //没有使用事务,进行转账
    @Test
    public void test() throws SQLException {

        Connection connection = JDBCUtils.getConnection();
        String sql = "update account set balance = (balance -1000) where id = 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();

        int i = 10/0;

        String sql2 = "update account set balance = (balance + 1000) where id = 2";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
        preparedStatement1.executeUpdate();


        JDBCUtils.close(null, connection, preparedStatement);


    }

    @Test
    public  void  transaction()  {

        Connection connection = JDBCUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            connection.setAutoCommit(false);
            String sql = "update account set balance = (balance -1000) where id = 1";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

           // int i = 10/0;

            String sql2 = "update account set balance = (balance + 1000) where id = 2";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
            preparedStatement1.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            JDBCUtils.close(null, connection, preparedStatement);

        }




    }
}
