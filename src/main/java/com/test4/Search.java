package com.test4;

import com.general.Console;

import java.util.Objects;

public class Search {
    private static Account[] accounts;

    Search(Account[] accounts){
        Search.accounts = accounts;
    }

    public static Account findAccount(String prompt){
        // Prompt user for account ID, search account list for relevant account
        Account searchedAccount = null;
        boolean accountFound = false;

        String accountID = Console.readString(prompt);
        for (Account account : accounts) {
            if (account != null) {
                if (Objects.equals(account.getId(), accountID)) {
                    searchedAccount = account;
                    accountFound = true;
                    break;
                }
            }
        }
        if (!accountFound) System.out.println("Invalid entry. That account ID does not exist.");
        return searchedAccount;
    }

    public static Account findAccount(String accountID, boolean toPrompt){
        // Used to find account when account ID is known, no prompt
        Account searchedAccount = null;
        boolean accountFound = false;

        for (Account account : accounts) {
            if (account != null) {
                if (account.getId().equals(accountID)) {
                    searchedAccount = account;
                    accountFound = true;
                    break;
                }
            }
        }
        if (!accountFound) System.out.println("Invalid entry. That account ID does not exist.");
        return searchedAccount;
    }
}
