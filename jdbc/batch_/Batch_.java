package com.dreaMTank.jdbc.batch_;

import com.dreaMTank.jdbc.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
      @Test
    public void noBatch() throws SQLException {
          Connection connection = JDBCUtils.getConnection();
          String sql = "insert into admin2 values(null,?,?)";
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          System.out.println("开始执行语句");
          long start = System.currentTimeMillis();
          for (int i = 0; i < 5000; i++) {
              preparedStatement.setString(1,"jack"+ i);
              preparedStatement.setString(2,"666");
              preparedStatement.executeUpdate();
          }
          long end = System.currentTimeMillis();
          System.out.println("用时"+ (end-start));
          JDBCUtils.close(null,connection,preparedStatement);
      }

      //使用batch
      @Test
      public void batch() throws Exception {
          Connection connection = JDBCUtils.getConnection();
          String sql = "insert into admin2 values(null,?,?)";
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          System.out.println("开始执行语句");
          long start = System.currentTimeMillis();
          for (int i = 0; i < 5000; i++) {
              preparedStatement.setString(1,"jack"+ i);
              preparedStatement.setString(2,"666");
              //将语句加入到批量处理包中
              preparedStatement.addBatch();
              //当有一千条时处理
              if((i+1)%1000 == 0){
                  preparedStatement.executeBatch();
                  preparedStatement.clearBatch();
              }
          }
          long end = System.currentTimeMillis();
          System.out.println("用时"+ (end-start));
          JDBCUtils.close(null,connection,preparedStatement);
      }
}
