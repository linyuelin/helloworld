package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示正则匹配符的使用
 *
 */
public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11 c8AB_C.@";
        //String regStr = "[a-z]"; //匹配a～z之间任意字符
        //String regStr = "[A-Z]";
       // String regStr = "a";  //默认区分大小写
       // String regStr = "(?i)a"; //不区分大小写
        //String regStr = "(?i)abc";
        //String regStr = "abc";
         // String regStr = "[0-9]";
        //String regStr = "[^a-z]{2}";
       // String regStr = "[abcd]"; //取abcd中大的任意
       // String regStr = "\\D"; //取不在0～9的任意字符
        // String regStr = "\\w"; //取英文字母，数字，下划线
       // String regStr = "\\W"; //取非英文字母，数字，下划线
       // String regStr = "\\s"; //取空格，制表符
        //String regStr = "\\S"; //取非空格，制表符
        String regStr = "\\."; //取\n之外的所有字符，如果要匹配本身需要使用\\.







        Pattern pattern = Pattern.compile(regStr);//Pattern.CASE_INSENSITIVE);//Pattern.CASE_INSENSITIVE表示匹配时不区分大小写
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group());
        }
    }
}
