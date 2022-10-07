package com.test4;
import com.general.Console;

public class Transaction {
    private final Account account;

    Transaction(Account account){
        this.account = account;
    }

    public void transferMoney(){
        Account receiver;
        receiver = Search.findAccount("Enter the destination account ID: ");

        int amount = (int) Console.readNumber("Enter the amount being transferred: ", 0);
        account.transferTo(receiver, amount);
        System.out.println("Money transferred.\n");
    }

    public void transferMoney(Account receiver, int amount){
        account.transferTo(receiver, amount);
        System.out.println("Money transferred.\n");
    }

    public void deposit(){
        int amount = (int) Console.readNumber("Enter the amount being deposited: ", 0);
        account.credit(amount);
        System.out.println("Money deposited.\n");
    }

    public void deposit(int amount){
        account.credit(amount);
        System.out.println("Money deposited.\n");
    }

    public void withdraw() throws InsufficientFundsException {
        int amount = (int) Console.readNumber("Enter the amount being withdrawn: ", 0);
        try {
            account.debit(amount);
        } catch (InsufficientFundsException e) {
            throw new InsufficientFundsException(e.getMessage());
        }
        System.out.println("Money withdrawn.\n");
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        try {
            account.debit(amount);
        } catch (InsufficientFundsException e) {
            throw new InsufficientFundsException(e.getMessage());
        }
        System.out.println("Money withdrawn.\n");
    }
}
