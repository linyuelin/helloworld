package com.dreamTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 正则表达式的应用
 */
public class RegExp10 {
    public static void main(String[] args) {
        String content = "1334567890";//""韩顺平教育";

         //汉字范围
        //String regStr = "^[\u0391 -\uffe5]+$";

        //邮政编码
        //String regStr = "^[1-9]\\d{5}$";

        //QQ号
        //String regStr = "^[1-9]\\d{4,9}$";

        //手机号
        //以13，14，15，18开头的11位数
        String regStr = "^1[3|4|5|8]\\d{9}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }

    }
}
