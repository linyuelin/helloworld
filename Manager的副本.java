package com.dreamTank.oopHomework;

public class Manager extends Staff {

    private double bonus;
    public Manager(String name, double dailyWages, int day, double grade) {
        super(name, dailyWages, day, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String showSal() {
        return "经理"+ getName()+"工资如下"+(getBonus()+getDailyWages()*getDay()*getGrade());
    }
}
