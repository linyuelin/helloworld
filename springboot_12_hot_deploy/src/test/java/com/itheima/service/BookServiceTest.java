package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(2));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(4);
        book.setName("挪威的森林");
        book.setType("文学");
        book.setDescription("村上春樹さんの代表作");
        bookService.updateById(book);

    }

    @Test
    void testInsert(){
        Book book = new Book();
        book.setId(4);
        book.setName("ノーウェアの森");
        book.setType("文学");
        book.setDescription("村上春樹さんの代表作");
        bookService.save(book);
    }


    @Test
    void testDelete() {
        bookService.removeById(13);
    }
    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }
    @Test
    void testGetPage(){
        IPage<Book> page = new Page<Book>(1,1);
        bookService.page(page);

        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());

    }
}
