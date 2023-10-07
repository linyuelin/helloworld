package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
//设置表名映射关系
//@TableName("tb_user")
public class User {
//    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;

//    @TableLogic(value = "0",delval = "1")
//    逻辑删除字段
    private Integer deleted;

    @Version()
    private Integer version;

}















