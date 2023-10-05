package com.example.springboot_09_ssm.controller;



import com.example.springboot_09_ssm.exception.BusinessException;
import com.example.springboot_09_ssm.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){

        return new Result(ex.getCode(),null,ex.getMessage());

    }


    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统有误，请稍后再试");
    }
}
