package com.najmaldeen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(0);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
//        System.out.println(list.indexOf(20));
        list.printMiddle();

//        System.out.println(Arrays.toString(list));
    }
}