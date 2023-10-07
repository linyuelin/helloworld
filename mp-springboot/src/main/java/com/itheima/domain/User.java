package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("tb_user")
//@AllArgsConstructor
//@NoArgsConstructor
public class User extends Model<User> {

    @TableId(type = IdType.AUTO,value = "id")
    private Long id;
    private String userName;


    //插入数据时填充
    @TableField(select = false,fill = FieldFill.INSERT)
    private String password;
    private String name;
    private Integer age;
    @TableField(value = "email")
    private String mail;

    @TableField(exist = false)
    private String address;

    @Version
    private Integer version;


    @TableLogic(value = "0",delval = "1")
    private Integer deleted;


//    private SexEnum sex ;
}
