package com.dreamTank.mhl.dao;

import com.dreamTank.mhl.utils.JDBCUtilsbyDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.List;


//开发basicdao，是其他dao的父类
public class BasicDAO<T> {
   private QueryRunner qr = new QueryRunner();


   //开发通用dml方法，针对任意表
    public int update(String sql,Object...param){
        Connection connection = null;
        try {
           connection = JDBCUtilsbyDruid.getConnection();
            int update = qr.update(connection,sql, param);
            return update;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsbyDruid.close(null,connection,null);
        }
    }


     //返回多个对象，针对任意表

    /**
     *
     * @param sql
     * @param clazz
     * @param param
     * @return
     */
    public List<T> queryMulti(String sql,Class<T> clazz,Object...param){
        Connection connection = null;
        try {
        connection = JDBCUtilsbyDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), param);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsbyDruid.close(null,connection,null);
        }

    }


    //查询单行
    public T querySingle (String sql,Class<T> clazz,Object...param){
        Connection connection = null;

        try {
            connection = JDBCUtilsbyDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<T>(clazz), param);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsbyDruid.close(null,connection,null);
        }

    }


    //返回单行单列
    public Object queryScalar (String sql,Object...param){
        Connection connection = null;
        try {
            connection = JDBCUtilsbyDruid.getConnection();
            return qr.query(connection,sql,new ScalarHandler(),param);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsbyDruid.close(null,connection,null);
        }
    }
}
