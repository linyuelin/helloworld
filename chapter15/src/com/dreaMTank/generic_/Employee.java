package com.dreaMTank.generic_;

/**
 * @author 林
 * @versoin 1.0
 */
public class Employee {
    private String name;
    private double sal;
    Object s;

    public Employee(String name, double sal, Object s) {
        this.name = name;
        this.sal = sal;
        this.s = s;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", s=" + s +
                '}';
    }
}

