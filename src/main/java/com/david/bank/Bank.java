package com.david.bank;

public class Bank {
    String name;
    double finalAmount;

    String accountHolderName;
    double balance;


    public Bank(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}