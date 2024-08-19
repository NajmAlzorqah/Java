package com.najmaldeen.session8;

class Authenticate {
    /**
     * Define an anonymous class
     *
     */
    Account objAcc = new Account() {
/**
 * Displays balance
 *
 * @param accNo a String variable storing balance
 * @return void*/
@Override
public void displayBalance(String accNo) {
    System.out.println("Retrieving balance. Please wait...");
// Assume that the server returns 40000
    System.out.println("Balance of account number " + accNo.toUpperCase() + " is $40000");
}
    }; // End of anonymous class
}
/**
 * Define the Account class
 *
 */
class Account {
    /**
     * Displays balance
     *
     * @param accNo a String variable storing balance
     * @return void
     */
    public void displayBalance(String accNo) {
    }
}
/**
 * Define the TestAuthentication class
 *
 */
public class TestAuthentication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Instantiate the Authenticate class
        Authenticate objUser = new Authenticate();
// Check the number of command line arguments
        if (args.length == 3) {
            if (args[0].equals("admin") && args[1].equals("abc@123")){
// Invoke the displayBalance() method
                objUser.objAcc.displayBalance(args[2]);
            }
            else{
                System.out.println("Unauthorized user");
            }
        }
        else {
            System.out.println("Usage: java Authenticate <user-name> <password> <account-no>");
        }
    }
}