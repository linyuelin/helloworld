package com.itheima.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTestCase {

    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.getByIdBook(1));

        System.out.println(bookDao.selectById(2));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(3);
        book.setName("ノーウェアの森");
        book.setType("文学");
        book.setDescription("村上春樹さんの代表作");
        bookDao.updateById(book);

    }

    @Test
    void testInsert(){
        Book book = new Book();
        book.setId(4);
        book.setName("ノーウェアの森");
        book.setType("文学");
        book.setDescription("村上春樹さんの代表作");
        bookDao.insert(book);
    }


    @Test
    void testDelete() {
        bookDao.deleteById(4);
    }
    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }
    @Test
    void testGetPage(){
        IPage page = new Page(1,1);
        bookDao.selectPage(page,null);

        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());

    }
}
