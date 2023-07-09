package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//分析java正则表达式的底层实现
public class RegTheory {
    public static void main(String[] args) {

        String content = "Java 是一个通用术语，用于表示 Java 软件及其组件，包括“Java 运行时环境 (JRE)”、“Java 虚拟机 (JVM)”以及“插件”。 [1]" +
                "Java具有大部分编程语言所共有的一些特征，被特意设计用于互联网的分布式环境。Java具有类似于C++语言的形式和感觉，但它要比C++语言更易于使用，" +
                " 而且在编程时彻底采用了一种以对象为导向的方式" +
                "Java版本指的是 Java 系列和更新编号。示例：在网站上或者 Windows1997 程序中，版本显示为 Java 8 Update 25。旧版本也可显示为 1.7.0_65，这表示 Java 7 Update 65。";
         //匹配所有四个数字
        //1.\\d表示一个任意的数字
        String regStr = "\\d\\d\\d\\d";
        //2,创建模式对象「即正则表达式对象」
        Pattern pattern = Pattern.compile(regStr);
        //3.创建匹配器
        //表示创建一个matcher 按照正则表达式的规则去匹配content字符串
        Matcher matcher = pattern.matcher(content);
        //4开始匹配
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
