package com.techelevator;

public class SavingsAccount extends BankAccount {
    public static final int SERVICE_CHARGE = 2;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 150) {
                super.withdraw(SERVICE_CHARGE);
            }
        }
        return getBalance();
    }

}
