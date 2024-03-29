package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示转义字符的使用
 */
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(abc)==~^)nsm s(";
       String regStr  = "\\(";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
