package com.example.springboot_09_ssm.service.impl;


import com.example.springboot_09_ssm.controller.Code;
import com.example.springboot_09_ssm.dao.BookDao;
import com.example.springboot_09_ssm.domain.Book;
import com.example.springboot_09_ssm.exception.BusinessException;
import com.example.springboot_09_ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        return bookDao.save(book)> 0;

    }

    public boolean update(Book book) {
      return   bookDao.update(book) > 0;

    }

    public boolean delete(Integer id) {
      return bookDao.delete(id) > 0;

    }

    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"输入有误");
        }
//
//
//        //包装，转换成自定义异常
//
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试",e);
//        }


        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
