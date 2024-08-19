package com.najmaldeen.session8;

interface Person{
    default void display1(String msg){
        msg+=" from display1";
        printMessage(msg);
    }
    default void display2(String msg){
        msg+=" from display2";
        printMessage(msg);
    }
    private void printMessage(String msg){
        System.out.println(msg);
    }
}
