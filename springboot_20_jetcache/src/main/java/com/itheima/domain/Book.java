package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
//@TableName("tbl_book")
public class Book  implements Serializable {

    private Integer id;
    private String type;
    private String name;
    private String description;

}
