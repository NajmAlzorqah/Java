package com.najmaldeen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    // Generics when Explain
//    public static void printArray(int [] array){
//        for (int i : array) {
//            System.out.println(i);
//        }
//    }

//    public static <T> void printArray(T[] array){
//        for (T t : array) {
//            System.out.println(t);
//        }
//    }
    //=========================================================
    // Practical

    public static <T> void printCollection(T[] array) {
        for (T t : array) {
            System.out.println("Array element is: " + t + " Type of the element is: " + t.getClass().getSimpleName());
        }
    }

    public static <T> void printCollection(List<T> array) {
        for (T t : array) {
            System.out.println("List element is: " + t + " Type of the element is: " + t.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        // Lambda
        //Anonymous class

        // When Explain
//        ArarbicGreeting ag = new ArarbicGreeting();
//        ag.hi();
//
//        Greeting eGreeting = new Greeting() {
//            @Override
//            public void hi() {
//                System.out.println("Hello");
//            }
//        };
//        eGreeting.hi();
//
//        Greeting jGreeting = () -> System.out.println("Ohaio");
//        jGreeting.hi();

        //=====================================================
        // Practical

        // Anonymous Class
//        Calc sum = new Calc() {
//            @Override
//            public int sum(int num1, int num2) {
//                return num1 + num2;
//            }
//        };
//        System.out.println("The sum is: " + sum.sum(5, 5));
//
//        // Lambda
//        Calc sum2 = (num1, num2) -> num1 + num2;
//        System.out.println("The sum is: " + sum2.sum(3, 5));


        //=====================================================

        // Generic
        //Logic , Object
        // When Explain

        // Rules to Follow When Using Generics:
        // 1- Generics does not accept primitive data type it only accepts reference data type
        // which is why we use [Wrapper Class]
        // 2- And the logic of the method should be the same for each data type

//        Integer[] numbers ={1,2,3,4,5,6,7};
//        printArray(numbers);
//        Float[] floatNumbers ={1.2f,1.2f,45f,0.5f,5f};
//        printArray(floatNumbers);
//        String[] names = {"Ahmed","Najm","Abdo"};
//        printArray(names);

        // ========================================================
        // Practical

//        Integer[] numbers = {1,2,3,4,5,6,7,8};
//        printCollection(numbers);
//        Float[] floats = {1.5f,53.5f,69.6f,5f};
//        printCollection(floats);
//        String[] names = {"Ahmed","Ali","Mohammed"};
//        printCollection(names);
//
//        ArrayList list = new ArrayList(List.of("Najm",3,"Ahmed","hi"));
//        printCollection(list);

        // ========================================================

        // Annotation
        // Metadata


        // ========================================================
        // Stream
        // Collections
        // When Explain
//        IntStream.range(1,10).filter(i-> i%2 == 0).forEach(System.out::println);

        // ========================================================
        // Practical
        IntStream.range(1, 100).filter(i -> i % 2 == 0 && i % 5 == 0).forEach(System.out::println);

        Stream.of("Ahmed", "Ali", "andy", "Mady")
                .filter(x -> x.startsWith("A") || x.startsWith("a"))
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .forEach(System.out::println);//[::] this called method reference

        // ========================================================

        // Multi line string
        String multiLine = "First line" +
                "Second line";

//        multiLine = """
//                first line
//                second line
//                """;

        System.out.println(multiLine);

    }
}