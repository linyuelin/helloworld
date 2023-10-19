//package com.itheima;
//
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.itheima.domain.Book;
//import org.junit.jupiter.api.Test;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
////@RunWith(SpringRunner.class)
//class testUserMapper {
//
//    @Test
//    public void testSelectById(){
//      Book user = new Book();
//      user.setId(5L);
//
//      Book user1 =user.selectById();
//      System.out.println(user1);
//  }
//
//  @Test
//  public void testInsert(){
//      Book user = new Book();
//      user.setMail("liubei@ii");
//      user.setAge(30);
//      user.setUserName("liubei");
//      user.setName("刘备");
//      user.setPassword("9999");
//      user.setAddress("四川");
//
//     Boolean insert = user.insert();
//      System.out.println(insert);
//  }
//
//  @Test
//  public void testUpdate(){
//      Book user = new Book();
//      user.setAge(39);
//      user.setId(9L);
//
//      Boolean result = user.updateById();
//      System.out.println(result);
//  }
//
//@Test
//    public void testUpdateVersion(){
//        Book user = new Book();
//
//        Book user1 = user.selectById(3L);
//        Book user2 = user.selectById(3L);
//
//        user1.setName("jock aaa");
//        user1.updateById();
//
//        user2.setName("jock bbb");
//        user2.updateById();
//    }
//
//
//  @Test
//    void testDelete(){
//      Book user = new Book();
//      user.setId(10L);
//      Boolean result = user.deleteById();
//      System.out.println(result);
//  }
//  @Test
//   void testSelect(){
//      Book user = new Book();
//
//      QueryWrapper<Book> userQueryWrapper = new QueryWrapper<>();
//      userQueryWrapper.ge("age",20);
//      List<Book> list =user.selectList(userQueryWrapper);
//      for (Book user1 : list) {
//          System.out.println(user1);
//      }
//  }
//
//
//
//
//}
