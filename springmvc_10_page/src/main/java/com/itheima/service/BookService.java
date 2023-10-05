package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.test.context.TestConstructor;
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
