package com.test4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void newAccountTest(){
        Account newAccount = new Account("A1","Alex Ridgeley", 5000);
        Assertions.assertEquals(newAccount.getBalance(), 5000);
    }

    @Test
    public void newAccountTest_noBalance(){
        // Test overloaded constructor - balance should be set to 0
        Account newAccount = new Account("M3","John Smith");
        Assertions.assertEquals(newAccount.getBalance(), 0);
    }
}
