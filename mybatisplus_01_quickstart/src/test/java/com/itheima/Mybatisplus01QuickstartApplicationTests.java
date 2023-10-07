package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
   void testSave(){
       User user = new User();
       user.setName("marry");
       user.setPassword("smdsjsfj");
       user.setAge(12);
       user.setTel("07040874199");
       userDao.insert(user);
   }

   @Test
   void testDelete(){
        userDao.deleteById(1709126156365623297L);
   }

   @Test
   void testUpdate(){
       User user = new User();
       user.setId(1L);
       user.setName("tom666");

        userDao.updateById(user);
   }

   @Test
   void testGetById(){
       User user = userDao.selectById(2L);
       System.out.println(user);
   }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testGetByPage(){
        IPage page =  new Page(1,5);
        userDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());


    }

}
