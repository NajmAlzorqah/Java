package com.najmaldeen.session4;


public class TestCustomer {

    public static void main(String[] args) {

        Customer objCustomer = new Customer();
        // Initialize the object
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort, Main Street");

        objCustomer.displayCustomerInformation();
    }
}
