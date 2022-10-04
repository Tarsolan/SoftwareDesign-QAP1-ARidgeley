package com.test4;

public class Account {
    // Attributes
    private String id, name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Methods
    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount) throws InsufficientFundsException{
        if (amount <= balance){
            balance -= amount;
        } else throw new InsufficientFundsException();

        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        } else System.out.println("Transaction not processed. Amount exceeded current balance.");

        return balance;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
