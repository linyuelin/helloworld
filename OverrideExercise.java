package com.dreamTank.override;

public class OverrideExercise {
    public static void main(String[] args) {
        //在main中,分别创建Person和Student对象，调用say方法输出自我介绍

        Person jack = new Person("jack", 38);
        System.out.println(jack.say());

        Student student = new Student("james",39,3333,89);
        System.out.println(student.say());

    }
}

