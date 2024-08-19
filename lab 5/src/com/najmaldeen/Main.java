package com.najmaldeen;

public class Main {
    public static void main(String[] args) {
//        var obj = new Teacher("Bachelor's" ,"Najm" ,"Al-zorqah");
////        obj.setF_name("Najm");
////        obj.setL_name("Al-zorqah");
////        obj.setCert("Bachelor's");
//        obj.printFN();
//        obj.printInfo();
//
//        var hum = new Human();

        int fact = 1;
        for (int i = 1; i <= 4; fact *= i++) ;

        System.out.println("hiiii");
        System.out.println("Factorial: " + fact);

        MyMath myMath = new MyMath() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b) {
                return 0;
            }

            @Override
            public int mult(int a, int b) {
                return 0;
            }
        };

        System.out.println(myMath.add(2,3));


    }
}