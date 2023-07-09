package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示限定符的使用
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content = "a11111111aaaahello";
        //String regStr = "a{3}"; //匹配aaa
        //String regStr = "1{4}"; //匹配1111
        //String regStr = "\\d{2}"; //匹配两位的任意数字字符
        //String regStr = "a{3,4}"; //匹配aaa 或者aaaa　Java尽量匹配多的

        //String regStr = "1+"; //匹配1个1 或者多个1

        //String regStr = "1*"; //匹配0个1 或者多个1

        String regStr = "a1?"; //匹配a 或者a1



        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
