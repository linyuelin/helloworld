package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
//@TableName("tbl_book")
public class Book  {

    private Integer id;
    private String type;
    private String name;
    private String description;

}
