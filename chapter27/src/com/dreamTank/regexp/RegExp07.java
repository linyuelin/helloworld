package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {
    public static void main(String[] args) {
        String content = "2888   dnndsm 90309jsfkk300ma339 jce92j";
        //String regStr = "(\\d\\d)(\\d\\d)"; //匹配四个数字 分成两组

        //命名分组】
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到=" + matcher.group(0));
            System.out.println(matcher.group("g1"));
            System.out.println("找到第一组=" + matcher.group(1));
            System.out.println(matcher.group("g2"));
            System.out.println("找到第二组=" + matcher.group(2));

        }
    }
}
