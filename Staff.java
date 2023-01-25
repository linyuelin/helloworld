package com.dreamTank.oopHomework;

public class Staff {
    private String name;
    private double dailyWages;
    private  int day;
    private   double grade;

    public Staff(String name, double dailyWages, int day, double grade) {
        this.name = name;
        this.dailyWages = dailyWages;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(double dailyWages) {
        this.dailyWages = dailyWages;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public  String showSal(){
        return "工资如下" +dailyWages*day*grade ;
    }
}
