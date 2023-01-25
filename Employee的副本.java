package com.dreamTank.oopHomework;

public class Employee {
    //每月工资
    private String name;
    private double sal;
    private int salMonth;

    public Employee(String name, double sal, int salMonth) {
        this.name = name;
        this.sal = sal;
        this.salMonth = salMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }
    public void printSal(){
        System.out.println(name +" 工资= " +getSal()*getSalMonth());
    }
}