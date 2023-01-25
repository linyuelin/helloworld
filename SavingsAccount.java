package com.dreamTank.oopHomework;

public class SavingsAccount extends BankAccount {
    private double Interest = 0.1;
    private int count = 3;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getInterest() {
        return Interest;

    }

    public void setInterest(double interest) {
        Interest = interest;
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * Interest);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0){
        super.withdraw(amount);
        count--;
    }else{
         super.withdraw(amount + 1);
        }
    }
}

