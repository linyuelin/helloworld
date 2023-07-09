package com.dreamTank.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * a演示定位符的使用
 */
public class RegExp06 {
    public static void main(String[] args) {

       // String content = "123abc12";
        String content = "james jjsj hjames .ksk ks;";

        //以至少一个数字开头，后接任意小写字母的字符串
       // String regStr = "^[0-9]+[a-z]*";

        //至少以一个数字开头，必须以至少一个小写字母结束
       // String regStr = "^[0-9]+[a-z]+$";


         //匹配边界的james
        //String regStr = "james\\b";

        //匹配非边界james
        String regStr = "james\\B";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
