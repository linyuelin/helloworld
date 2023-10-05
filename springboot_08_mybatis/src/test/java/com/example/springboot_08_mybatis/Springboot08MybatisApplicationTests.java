package com.example.springboot_08_mybatis;

import com.example.springboot_08_mybatis.dao.BookDao;
import com.example.springboot_08_mybatis.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {
   @Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		Book byId = bookDao.getById(1);
		System.out.println(byId);
	}

}
