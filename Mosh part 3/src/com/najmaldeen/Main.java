package com.najmaldeen;


import com.najmaldeen.generics.GenericList;

public class Main {
    public static void main(String[] args) {
       var list =  new GenericList<Integer>();
       list.add(1);
       int number = list.get(0);

       new GenericList<Float>();
    }
}