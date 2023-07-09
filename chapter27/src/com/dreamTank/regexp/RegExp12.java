package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp12 {
    public static void main(String[] args) {

        String content = "12321-333444555";
        //连续两个相同
        //String regStr = "(\\d)\\1";

        //5个连续相同
        //String regStr = "(\\d)\\1{4}";

        //个位与千位相同，十位与百位相同
        //String regStr = "(\\d)(\\d)\\2\\1";

        //检索商品编号,形式如12321-333444555；
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";



        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
