package com.techManEli;

import java.util.Scanner;

public class Holder implements HolderOptions {
    private String Name;
    private String AccountId;
    private int balance;
    private int prevTransaction;

    public Holder(String name, String accountId) {
        Name = name;
        AccountId = accountId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPrevTransaction() {
        return prevTransaction;
    }


    @Override
    public void options() {
        char input = '\0';
        System.out.println("Hello " + this.Name + " what can I assist you with ? " + '\n');
        Scanner choice = new Scanner(System.in);
        System.out.println("A: Make a deposit " + '\n' + "B: Make a withdraw " + '\n' +
                "C: Check Balance " + '\n' + "D: Show Previous Transaction " + '\n' +
                "E: Show Account Details " + '\n' + "F: Exit" + '\n');

        do{
            System.out.println("please enter an input: ");
            char opt = choice.next().charAt(0);
            input = Character.toUpperCase(opt);
            System.out.println();

            switch(input) {
                case 'A':
                    System.out.println("Enter deposit amount: ");
                    int amount = choice.nextInt();
                    deposit(amount);
                    break;

                case 'B':
                    System.out.println("Enter withdraw amount");
                    int amount2 = choice.nextInt();
                    withdraw(amount2);
                    break;

                case 'C':
                    System.out.println("Your current balance is: $" +  balance);
                    break;

                case 'D':
                    System.out.println("Your Previous Transaction was " + prevTransaction );
                    break;

                case 'E':
                    accountDetails();
                    break;

            }
        } while (input != 'F');
        System.out.println("Thank you " + getName() + " have a great day");

    }


    public void deposit(int amount) {
        balance += amount;
        prevTransaction = amount;
        System.out.println("Your deposit of " + amount + " was a successful");

    }


    public void withdraw(int amount) {
        balance -= amount;
        prevTransaction = amount;
        System.out.println("Your withdraw of " + amount + " was successful");

    }

    public void accountDetails() {
        System.out.println("Name: " + getName() + '\n' +
                "Account Id: " + getAccountId() + '\n' +
                "Account Balance: " + balance);
    }




}
