package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp13 {
    public static void main(String[] args) {

        String content = "我......要要.学学编程";
        //去.
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        String s = matcher.replaceAll("");
        System.out.println(s);

        //去重
        pattern = Pattern.compile("(.)\\1+");
        matcher = pattern.matcher(s);
        String s1 = matcher.replaceAll("$1");
        System.out.println(s1);


    }
}
