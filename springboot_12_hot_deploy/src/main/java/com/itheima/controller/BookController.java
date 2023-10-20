package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.controller.utils.R;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        System.out.println("test hot deploy");
        System.out.println("test hot deploy");
        System.out.println("test hot deploy");
        System.out.println("test hot deploy");
        System.out.println("test hot deploy");
        System.out.println("test hot deploy");
        return new R(true, bookService.getById(id));
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {

        if(book.getName().equals("123"))throw new IOException();
        boolean flag = bookService.save(book);
        return new R(flag,flag ? "添加成功^_^":"添加失败-_-!");

    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.updateById(book));

    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//         //如果当前页码值大于总页码值，重新查询
//        if(currentPage > page.getPages()){
//           page= bookService.getPage((int)page.getPages(),pageSize);
//        }
//        return new R(true,page);
//    }


    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,String name,Book book) {
        System.out.println(name);
        System.out.println(book);
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于总页码值，重新查询
        if(currentPage > page.getPages()){
            page= bookService.getPage((int)page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }

}
