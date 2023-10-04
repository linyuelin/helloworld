package com.dreamtank;


import com.dreamtank.mapper.UserMapper;
import com.dreamtank.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo2 {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";

// 2. 使用 MyBatis 提供的 Resources 类加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

// 3. 使用 SqlSessionFactoryBuilder 创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<User> users = sqlSession.selectList("test.selectAll");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);

        sqlSession.close();

    }
}
