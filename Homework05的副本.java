package com.dreamTank.oopHomework;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack",3000,12);
        worker.printSal();

        Peasant peasant = new Peasant("james",4000,12);
        peasant.printSal();

        Teacher05 teacher05 = new Teacher05("scot",10000,12,200,10);
        teacher05.printSal();

        Scientist scientist = new Scientist("tom",30000,12,200000);
        scientist.printSal();

        Waiter waiter = new Waiter("belive",3500,10);
        waiter.printSal();

    }
}
