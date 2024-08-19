package com.najmaldeen.session4;

public class Account {
    private int accountID;
    private String holderName;
    private String accountType;
    /**
     * Initialization block
     */
    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }

    public void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: " + accountID + "\nAccount Type: " +
                accountType);
    }
}