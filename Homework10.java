package com.dreamTank.oopHomework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack", 18, "教师", '男', 10000);
        Doctor doctor1 = new Doctor("jack", 18, "教师", '男', 10000);
        System.out.println(doctor.equals(doctor1));
    }
}
