package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("保存済み"+book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){

        List<Book> list = new ArrayList<>();
        Book book = new Book();
        book.setId(1);
        book.setName("雪国");
        book.setDescription("川端康成さんの代表作");
        book.setType("文学");

        Book book1 = new Book();
        book1.setId(2);
        book1.setName("悩み雑貨店の奇跡");
        book1.setType("文学");
        book1.setDescription("東野圭吾のデビュー作品");
        list.add(book);
        list.add(book1);

        return list;
    }

}














