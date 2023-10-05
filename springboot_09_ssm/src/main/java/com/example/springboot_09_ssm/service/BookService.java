package com.example.springboot_09_ssm.service;

import com.example.springboot_09_ssm.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional

public interface BookService {


    /**
     *保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     *修正
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     *削除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     *IDによってセレクト
     * @param id
     * @return
     */
    public Book getById(Integer id);
    /**
     　全てセレクト
     * @param
     * @return
     */
    public List<Book> getAll();
}
