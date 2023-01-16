package com.dreamTank.override;

public class Dog extends Animal {
    //因为Dog是animal子类
    //Dog的cry方法和Animal的cry定义形式一样（名称，返回类型，参数）
    //这时Dog的cry方法，重写了Animal的cry方法。
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
}

