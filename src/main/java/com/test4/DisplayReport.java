package com.test4;

import java.text.NumberFormat;

public class DisplayReport {
    private Account account;
    private Account[] accounts;
    private NumberFormat currency;

    // Constructors, overloaded for varied use cases
    DisplayReport(Account account){
        this.account = account;
        currency = NumberFormat.getCurrencyInstance();
    }
    DisplayReport(Account[] accounts){
        this.accounts = accounts;
        currency = NumberFormat.getCurrencyInstance();
    }

    // Might be able to combine these into one
    public void displayAccountBalance(){
        System.out.println("Account balance: " + currency.format(account.getBalance()));
    }

    public void displayAccountBalances() {
        System.out.println("\nAccount balances: ");
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("Account #: " + account.getId());
                System.out.println("Name: " + account.getName());
                System.out.println("Current Balance: " + currency.format(account.getBalance()));
                System.out.println();
            }
        }
    }
}
