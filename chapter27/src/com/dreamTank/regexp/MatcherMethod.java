package com.dreamTank.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher类的常用方法
 */
public class MatcherMethod {
    public static void main(String[] args) {
      String content = "hello sdu jack jakk hello  ajjja hello ";
//        String regStr = "hello.*";
//
//        Pattern pattern = Pattern.compile(regStr);
//        Matcher matcher = pattern.matcher(content);
//        while(matcher.find()){
//            System.out.println("===================");
//            System.out.println(matcher.start());
//            System.out.println(matcher.end());
//            System.out.println(content.substring(matcher.start(), matcher.end()));
//
//        }
//
//        //整体匹配,多用于校验
//        System.out.println(matcher.matches());
//
         //替换,原来的content无变化
        String regStr = "hello";
        Pattern pattern = Pattern.compile(regStr);
         Matcher matcher = pattern.matcher(content);
        String regStr1 = matcher.replaceAll("哈罗");
        System.out.println(regStr1);
    }
}
