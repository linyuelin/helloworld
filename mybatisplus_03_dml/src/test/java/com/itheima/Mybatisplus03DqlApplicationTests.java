package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
//        user.setId(667L);
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
//        List<Long> list = new ArrayList<>();
//        list.add(1709446829399179266L);
//        list.add(1709447467931336705L);
//        list.add(1709448041017679874L) ;
//       userDao.deleteBatchIds(list);


//        List<Long> list = new ArrayList<>();
//        list.add(1L);
//        list.add(2L);
//        list.add(3L) ;
//        userDao.selectBatchIds(list);
//

        userDao.deleteById(2L);

//        System.out.println(userDao.selectList(null));

    }

    @Test
    void testUpdate(){
//        User user = new User();
//        user.setId(3L);
//        user.setName("jock666");
//        user.setPassword("jock666");
//        user.setVersion(1);
//        userDao.updateById(user);


        User user = userDao.selectById(3L);
        User user2 = userDao.selectById(3L);

        user2.setName("jock aaa");
        userDao.updateById(user2);

        user.setName("jock bbb");
        userDao.updateById(user);




    }



}
