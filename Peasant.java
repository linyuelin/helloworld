package com.dreamTank.oopHomework;

public class Peasant extends Employee{
    public Peasant(String name, double sal, int salMonth) {
        super(name, sal, salMonth);
    }

    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}
