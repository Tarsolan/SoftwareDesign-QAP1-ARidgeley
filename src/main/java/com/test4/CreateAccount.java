package com.test4;

import com.general.Console;

public class CreateAccount {
    private static Account[] accounts = new Account[32];
    private static int numberOfAccounts = 0;

    public static void createAccount() {
        String accountID = Console.readString("Enter the account ID: ");
        String firstName = Console.readString("Enter the first name of the Account Holder: ");
        String lastName = Console.readString("Enter the last name of the Account Holder: ");
        int startingBalance = (int) Console.readNumber("Enter the opening balance: ", 0);
        System.out.println();

        accounts[numberOfAccounts] = new Account(accountID, firstName + " " + lastName, startingBalance);
        numberOfAccounts++;
        new Search(accounts);
    }

    public static void createAccount(String accountID, String fullName, int startingBalance){
        accounts[numberOfAccounts] = new Account(accountID, fullName, startingBalance);
        numberOfAccounts++;
        new Search(accounts);
    }

    public static Account[] getAccounts() {
        return accounts;
    }
}
