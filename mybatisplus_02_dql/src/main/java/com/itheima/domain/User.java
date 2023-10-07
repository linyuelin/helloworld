package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//lombok
@Data
@TableName("tb_user")
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd")
    private String password;
    private Integer age;
    private String tel;

      @TableField(exist = false)
    private Integer online;
}
