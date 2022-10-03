package com.test4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransactionTest {
    @Test
    public void testTransfer(){
        // Create a couple test accounts
        Account accountOne = new Account("A1","Alex Ridgeley", 5000);
        Account accountTwo = new Account("A2","Matthew Ridgeley", 8000);

        // Create new transaction object for active user
        Transaction transaction = new Transaction(accountOne);

        // Test transfer method
        transaction.transferMoney(accountTwo, 2000);
        Assertions.assertEquals(accountOne.getBalance(), 3000);
    }

    @Test
    public void testDeposit(){
        Account account = new Account("A1","Alex Ridgeley", 5000);
        // Create new transaction object for active user
        Transaction transaction = new Transaction(account);

        // Test deposit method
        transaction.deposit(5000);
        Assertions.assertEquals(account.getBalance(), 10_000);
    }

    @Test
    public void testWithdraw(){
        Account account = new Account("A2","Matthew Ridgeley", 8000);

        // Create new transaction object for active user
        Transaction transaction = new Transaction(account);

        // Test withdraw method
        transaction.withdraw(7000);
        Assertions.assertEquals(account.getBalance(), 1000);
    }
}
