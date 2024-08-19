package com.najmaldeen.session4;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void displayCustomerInformation() {
        System.out.printf("%d %s %s %d",customerID,customerName,customerAddress,customerAge);
    }
    void changeCustomerAddress(String address){
        this.customerAddress = address;
    }
    
}
