package com.itheima.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @PostMapping
    public boolean saveBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBookById( @PathVariable Integer id){
        return bookService.delete(id);
    }

    @PutMapping
    public boolean updateBook(@RequestBody Book book){
        return bookService.update(book);
    }


}
