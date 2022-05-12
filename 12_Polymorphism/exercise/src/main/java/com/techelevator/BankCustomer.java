package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    private int balance;

    public BankCustomer() {
    }

    public BankCustomer(String name, String address, String phoneNumber, List<Accountable> accounts) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    public Accountable[] getAccounts() {
        Accountable[] customerAccount = new Accountable[accounts.size()];
        accounts.toArray(customerAccount);
        return customerAccount;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    @Override
    public int getBalance() {
        for(Accountable temp: accounts) {
            balance += temp.getBalance();
        }
        return balance;

    }

    public boolean isVip() {
        return getBalance() >= 25000;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
