package com.dreamTank.oopHomework;

public class GeneralStaff extends Staff {
    public GeneralStaff(String name, double dailyWages, int day, double grade) {
        super(name, dailyWages, day, grade);
    }

    @Override
    public String showSal() {
        return "普通员工"+ getName()+super.showSal();
    }
}
