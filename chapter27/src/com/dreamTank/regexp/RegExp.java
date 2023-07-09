package com.dreamTank.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 选择匹配符
 */
public class RegExp {
    public static void main(String[] args) {
        String content = "jack james kobe ";
        String regStr = "james|kobe";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
