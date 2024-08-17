package com.najmaldeen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Group B Assignment
        var list = new ArrayList<>();
        list.add("Ali");
        list.add(10);
        list.add("Ahmed");
        list.add(10);
        list.add("Said");
        list.add(10);
        list.add("Naji");

        for (Object element : list) {
            if (element instanceof String)
                System.out.println(element);
        }

    }
}