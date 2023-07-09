package com.dreamTank.regexp;

public class Homework02 {
    public static void main(String[] args) {
        //验证一个数是不是整数或小数

        String content = "0.3";
        System.out.println(content.matches("^[-|+]?([1-9]\\d*|0)(\\.\\d+)?$"));
    }
}
