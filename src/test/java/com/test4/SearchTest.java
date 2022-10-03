package com.test4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {
    @Test
    public void findAccount(){
        CreateAccount.createAccount("A1","Alex Ridgeley", 5000);
        CreateAccount.createAccount("A2","John Smith", 1_000_000);
        CreateAccount.createAccount("M2","Teddy Lloyd", 23_567);

        // Attempt to find account that does exist
        Assertions.assertNotNull(Search.findAccount("A2", false));
    }

    @Test
    public void findNonExistingAccount(){
        CreateAccount.createAccount("A1","Alex Ridgeley", 5000);
        CreateAccount.createAccount("A2","John Smith", 1_000_000);
        CreateAccount.createAccount("M2","Teddy Lloyd", 23_567);

        // Attempt to find account that does not exist
        Assertions.assertNull(Search.findAccount("M5", false));
    }
}
