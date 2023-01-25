package com.dreamTank.oopHomework;

public class Scientist extends Employee {
    private double Yearendawards;

    public Scientist(String name, double sal, int salMonth, double yearendawards) {
        super(name, sal, salMonth);
        Yearendawards = yearendawards;
    }

    public double getYearendawards() {
        return Yearendawards;
    }

    public void setYearendawards(double yearendawards) {
        Yearendawards = yearendawards;
    }

    @Override
    public void printSal() {
        System.out.print("科学家 ");
        System.out.println(getName()+" 工资="+getSal()*getSalMonth()+getYearendawards());
    }
}
