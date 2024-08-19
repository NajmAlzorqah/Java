package com.najmaldeen.session4;


public class TestCustomer {

    public static void main(String[] args) {
        // Creates an object of the class
        Customer objCustomer = new Customer();
        // Initialize the object
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;
        /*
         * Invokes the instance method to display the details of objCustomer object
         */
        objCustomer.displayCustomerInformation();
        /*
         * Invokes the instance method to change the address of the objCustomer object
         */
        objCustomer.changeCustomerAddress("123 Fort, Main Street");
        /*
         * Invokes the instance method after changing the address field
         * of objCustomer object
         */
        objCustomer.displayCustomerInformation();
    }
}
