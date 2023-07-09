package com.dreamTank.regexp;

public class StringReg {
    public static void main(String[] args) {
        String content = "Java 是一个通用术语，用于表示 Java 软件及其组件，包括“Java 运行时环境 (JRE)”、“Java 虚拟机 (JVM)”以及“插件”。 [1]\n" +
                "Java具有大部分编程语言所共有的一些特征，被特意设计用于互联网的分布式环境。Java具有类似于C++语言的形式和感觉，但它要比C++语言更易于使用，而且在编程时彻底采用了一种以对象为导向的方式。\n" +
                "Java版本指的是 Java 系列和更新编号。示例：在网站上或者 Windows 程序中，版本显示为 Java 8 Update 25。旧版本也可显示为 1.7.0_65，这表示 Java 7 Update 65。";

        //使用正则表达式，将java替换成爪哇
        String s = content.replaceAll("Java|JRE", "爪哇");
        System.out.println(s);

        //验证手机号 要求以139开头
        content = "13888884729";
       if(content.matches("1(38|39)\\d{8}")){
           System.out.println("验证成功");
       }else {
           System.out.println("验证失败");
       }

       //分割
        content = "ajsjskakl#kdkk-ajjajkd~";
        String[] split = content.split("#|-|~|\\d+");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
