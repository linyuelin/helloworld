package com.dreamTank.oopHomework;

public class Teacher05 extends Employee{
    private int classDay;
    private double classSal;

    public Teacher05(String name, double sal, int salMonth, int classDay, double classSal) {
        super(name, sal, salMonth);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.print("教师 ");
        System.out.println(getName()+" 工资="+getSal()*getSalMonth()+getClassDay()*getClassSal());
    }
}
