package com.dreamTank.oopHomework;

public class Homework04 {
    public static void main(String[] args) {
        GeneralStaff staff = new GeneralStaff("张三", 100, 30, 1.0);
        System.out.println(staff.showSal());

        Manager manager = new Manager("刘长青", 300, 30, 1.2);
        manager.setBonus(1000);
        System.out.println(manager.showSal());
    }
}
