package com.itheima.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        //先获取password值，然后判断，如果为null,则做处理
        Object password = getFieldValByName("password", metaObject);
        if(null == password){
            setFieldValByName("password","888888",metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
