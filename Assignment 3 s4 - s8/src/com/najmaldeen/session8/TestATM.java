package com.najmaldeen.session8;

import java.util.Calendar;
class AtmMachine {
    /**
     * Define the static nested class
     *
     */
    static class BankDetails {
        // Instantiate the Calendar class of java.util package
        static Calendar objNow = Calendar.getInstance();
        /**
         * Displays the bank and transaction details
         *
         * @return void
         */
        public static void printDetails(){
            System.out.println("State Bank of America");
            System.out.println("Branch: New York");
            System.out.println("Code: K3983LKSIE");
// retrieving current date and time using Calendar object
            System.out.println("Date-Time:" + objNow.getTime());
        }
    }
    /**
     * Displays balance
     * @param accNo a String variable that stores the account number
     * @return void
     */
    public void displayBalance(String accNo) {
// Assume that the server returns 200000
        System.out.println("Balance of account number " + accNo.toUpperCase() +
                " is $200000");
    }
}
/*** Define the TestATM class
 *
 */
public class TestATM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length ==1) { // verifying number of command line arguments
            // Instantiate the outer class
            AtmMachine objAtm = new AtmMachine();
// Invoke the static nested class method using outer class object
            AtmMachine.BankDetails.printDetails();
            // Invoke the instance method of outer class
            objAtm.displayBalance(args[0]);
        }
        else{
            System.out.println("Usage: java AtmMachine <account-no>");
        }
    }
}