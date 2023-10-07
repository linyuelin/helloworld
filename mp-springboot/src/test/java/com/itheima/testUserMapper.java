package com.itheima;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
//@RunWith(SpringRunner.class)
class testUserMapper {

    @Test
    public void testSelectById(){
      User user = new User();
      user.setId(10L);

      User user1 =user.selectById();
      System.out.println(user1);
  }

  @Test
  public void testInsert(){
      User user = new User();
      user.setMail("liubei@ii");
      user.setAge(30);
      user.setUserName("liubei");
      user.setName("刘备");
      user.setPassword("9999");
      user.setAddress("四川");

     Boolean insert = user.insert();
      System.out.println(insert);
  }

  @Test
  public void testUpdate(){
      User user = new User();
      user.setAge(39);
      user.setId(9L);

      Boolean result = user.updateById();
      System.out.println(result);
  }


    @Test
    public void testUpdateVersion(){
        User user = new User();

        User user1 = user.selectById(3L);
        User user2 = user.selectById(3L);

        user1.setName("jock aaa");
        user1.updateById();

        user2.setName("jock bbb");
        user2.updateById();
    }


  @Test
    void testDelete(){
      User user = new User();
      user.setId(10L);
      Boolean result = user.deleteById();
      System.out.println(result);
  }
  @Test
   void testSelect(){
      User user = new User();

      QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
      userQueryWrapper.ge("age",20);
      List<User> list =user.selectList(userQueryWrapper);
      for (User user1 : list) {
          System.out.println(user1);
      }
  }




}
