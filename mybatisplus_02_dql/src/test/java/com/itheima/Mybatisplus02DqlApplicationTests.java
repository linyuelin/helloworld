package com.itheima;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;
import java.util.Map;


@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {

//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.lt("age",18);
//        List<User> userList = userDao.selectList(wrapper);
//        System.out.println(userList);

//        QueryWrapper<User> qw = new QueryWrapper();
//        qw.lambda().lt(User::getAge,5);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);

//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
//        userLambdaQueryWrapper.gt(User::getAge,3);
//        userLambdaQueryWrapper.lt(User::getAge,20);
//        List<User> users = userDao.selectList(userLambdaQueryWrapper);
//        System.out.println(users);


        //あるいは
//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
////        userLambdaQueryWrapper.gt(User::getAge,20).or().lt(User::getAge,10);
//        userLambdaQueryWrapper.eq(User::getAge,3);
//        List<User> users = userDao.selectList(userLambdaQueryWrapper);
//        System.out.println(users);


//        UserQuery userQuery = new UserQuery();
//        userQuery.setAge(4);
//        userQuery.setAge2(20);
//
//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
//        //判断する
////        userLambdaQueryWrapper.lt(User::getAge,userQuery.getAge2());
//        userLambdaQueryWrapper.lt(null != userQuery.getAge2(),User::getAge,userQuery.getAge2());
//        userLambdaQueryWrapper.gt(null != userQuery.getAge(),User::getAge,userQuery.getAge());
////        userLambdaQueryWrapper.gt(User::getAge,userQuery.getAge());
//        List<User> users = userDao.selectList(userLambdaQueryWrapper);
//        System.out.println(users);



//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //查询投影
//         userLambdaQueryWrapper.select(User::getId,User::getAge);

//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//
//        userQueryWrapper.groupBy("tel");
//        //查询总数
//        userQueryWrapper.select("count(*) as count , tel");
//        List<Map<String, Object>> maps = userDao.selectMaps(userQueryWrapper);
//        System.out.println(maps);


        //信息验证
//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
//
//        userLambdaQueryWrapper.eq(User::getName,"Jerry").eq(User::getPassword,"jerry");
//        User user = userDao.selectOne(userLambdaQueryWrapper);
//        System.out.println(user);

//        //范围查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//         lqw.between(User::getAge,10,30);
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);



        //模糊查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.like(User::getName,"J");
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);




        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }

}
