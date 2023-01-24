package com.dreamTank.oopHomework;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double sal, double grade) {
        super(name, age, post, sal, grade);
    }




    @Override
    public String introduce() {
        System.out.println("这是教授的信息");
        return super.introduce();
    }
}

