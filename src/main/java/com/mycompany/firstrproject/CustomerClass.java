/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstrproject;

/**
 *
 * @author Ehis
 */
public class CustomerClass {

    String ninNo;
    String accountNo;
    String name;
    double balance;
    int pin;
    String cardNo;

    public CustomerClass(String ninNo, String accountNo, String name, double balance, int pin, String cardNo) {
        this.ninNo = ninNo;
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.cardNo = cardNo;
    }

    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getNinNo() {
        return ninNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setNinNo() {
        this.ninNo = ninNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return ninNo + "," + accountNo + "," + name + "," + balance + "," + pin + "," + cardNo;
    }
}
