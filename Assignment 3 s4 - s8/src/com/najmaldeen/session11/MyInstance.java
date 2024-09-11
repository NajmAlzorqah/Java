package com.najmaldeen.session11;

public class MyInstance {

    Object obj = 42;

    public void myMethod() {

        if (obj instanceof Integer) {
            int i = (Integer) obj;
            System.out.println("Integer value: " + i);
        } else if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String value: " + s);
        } else {
            System.out.println("Unknown value");
        }
    }
    public void myMethod2() {

        if (obj instanceof Integer i) {
            System.out.println("Integer value: " + i);
        } else if (obj instanceof String s) {

            System.out.println("String value: " + s);

        } else {
            System.out.println("Unknown value");
        }
    }
    public static void main(String[] args) {
        MyInstance myInstObj = new MyInstance();
        myInstObj.myMethod();
        myInstObj.myMethod2();
    }
}