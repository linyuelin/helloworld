package com.dreamTank.regexp;

public class Homework01 {
    public static void main(String[] args) {

       String content = "jams@skjj.com";
        System.out.println(content.matches("^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$"));
     }
}
