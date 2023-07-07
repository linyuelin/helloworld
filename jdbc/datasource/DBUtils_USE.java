package com.dreaMTank.jdbc.datasource;


import com.dreaMTank.jdbc.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

//使用apache-DBUtils 工具类+druid完成对表的crud操作
public class DBUtils_USE {
      @Test
      public void testQueryMany() throws Exception {

            //得到连接
            Connection connection = JDBCUtilsbyDruid.getConnection();
            //引入dbutils相关jar
            //创建  QueryRunner
            QueryRunner queryRunner = new QueryRunner();
            //执行相关方法，返回arraylist相关结果
            String sql = "select * from actor";
            List<actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(actor.class));
            for(actor actor :list){
                  System.out.println(actor);
            }

            JDBCUtilsbyDruid.close(null,connection,null);

      }


      //演示返回单行记录BeanHandler
      @Test
      public void testQuerySingle() throws Exception {
            Connection connection = JDBCUtilsbyDruid.getConnection();
            String sql = "select * from actor where id = ?";
            QueryRunner queryRunner = new QueryRunner();
            actor actor = queryRunner.query(connection, sql, new BeanHandler<>(actor.class), 1);
            System.out.println(actor);
            JDBCUtilsbyDruid.close(null,connection,null);

      }

      //演示返回单行单列ScalarHandler
      @Test
      public void testScalar() throws Exception {
            Connection connection = JDBCUtilsbyDruid.getConnection();

            String sql = "select name from actor where id = ?";
            QueryRunner queryRunner = new QueryRunner();
            Object query = queryRunner.query(connection, sql, new ScalarHandler<>(), 3);
            System.out.println(query);
            JDBCUtilsbyDruid.close(null,connection,null);


      }

      //演示dml
      @Test
      public void test_dml() throws Exception {
            Connection connection = JDBCUtilsbyDruid.getConnection();
            String sql = "update actor set name = ? where id = ?";
            QueryRunner queryRunner = new QueryRunner();
            int affectedRow = queryRunner.update(connection, sql, "hand", 3);
            System.out.println(affectedRow > 0?"成功":"执行未受影响");
            JDBCUtilsbyDruid.close(null,connection,null);
      }

      @Test
      public  void test_delete() throws Exception {
            Connection connection = JDBCUtilsbyDruid.getConnection();
            String sql = "delete from actor where id = ?";
            QueryRunner queryRunner = new QueryRunner();
            int affectedRow = queryRunner.update(connection, sql, 4);
            System.out.println(affectedRow > 0?"成功":"执行未受影响");
             JDBCUtilsbyDruid.close(null,connection,null);
      }
}
