package com.itheima;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.sql.Wrapper;
import java.util.*;


@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    @DirtiesContext
    void testGetAll() {

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //条件で絞る
//        lqw.like(User::getMail,"qq");
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }

    @Test
    public void testSelectById(){
        User user = new User();
        user.setId(2L);

        User user1 =user.selectById();
        System.out.println(user1);
    }

    @Test
    void testSelectBatchIds(){
        List<User> users = userDao.selectBatchIds(Arrays.asList(2L, 3L, 4L));
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void testSelectOne(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("name","james");
        User user = userDao.selectOne(userQueryWrapper);
        System.out.println(user);
    }

    @Test
    void testSelectCount(){

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.ge("age",20);
        Integer count = userDao.selectCount(wrapper);
        System.out.println(count);
    }

   @Test
   void testSelectPage(){
       Page<User> page = new Page<>(2,1);
       QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

       Page<User> page1 = userDao.selectPage(page, userQueryWrapper);
       System.out.println("総数"+page1.getTotal());
       System.out.println("総ページ数"+page1.getPages());
       System.out.println("現在のページ"+page1.getCurrent());

       List<User> records = page1.getRecords();
       for (User record : records) {
           System.out.println(record);
       }


   }

    @Test
    void testDelete2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name","zhangfei");
        int delete = userDao.delete(wrapper);
        System.out.println(delete);
    }


    @Test
    @DirtiesContext
    void testSave(){
        User user = new User();
        user.setMail("liubei@ii");
        user.setAge(30);
        user.setUserName("liubei");
        user.setName("刘备");
        user.setAddress("四川");
        int insert = this.userDao.insert(user);
        System.out.println(insert);
        System.out.println(user.getId());
    }


    @Test
    void testDelete(){

        ArrayList<Long> longs = new ArrayList<>();
        longs.add(1710103476672778246L);
        longs.add(1710103476672778244L);
        longs.add(1710103476672778245L);

        int i = userDao.deleteBatchIds(longs);
        System.out.println(i);
    }

    @Test
    void testDeleteByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("user_name","liubei");
        map.put("password","9999");

        int i = userDao.deleteByMap(map);
        System.out.println(i);
    }



    //根据id做更新
    @Test
    void testUpdateById(){
        User user = new User();
        user.setName("james");
        user.setId(1L);

        int i = userDao.updateById(user);
        System.out.println(i);
    }

    //根据条件做更新
    @Test
    void testUpdate(){
        User user = new User();
        user.setName("kobe");

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name","李四");

        int update = userDao.update(user, queryWrapper);
        System.out.println(update);
    }


    @Test
    void testUpdate2(){

        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.set("name", "davie").eq("name", "王五");

        int update = userDao.update(null, wrapper);
        System.out.println(update);
    }


   @Test
    void testOrderByAge(){
       QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
       userQueryWrapper.orderByDesc("age");
       userQueryWrapper.likeLeft("email","m");

       List<User> users = userDao.selectList(userQueryWrapper);
       for (User user : users) {
           System.out.println(user);
       }

   }


}
