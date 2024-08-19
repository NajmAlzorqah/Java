package com.najmaldeen.session8;

public interface IManufacturer {
    /**
     * Abstract method to add contact details
     * @param detail a String variable storing manufacturer detail
     * @return void
     */
    public void addContact(String detail);
/**
 * Abstract method to call the manufacturer
 * @param phone a String variable storing phone number
 * @return void*/

public void callManufacturer(String phone);
    /**
     * Abstract method to make payment
     * @param amount a float variable storing amount
     * @return void
     */
    public void makePayment(float amount);
}