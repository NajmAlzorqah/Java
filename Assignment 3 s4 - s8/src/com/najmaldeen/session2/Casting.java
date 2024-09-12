package com.najmaldeen.session2;

public class Casting {
public static void main(String[] args)
{
    // Implicit
    double dbl = 10;
    long lng = 100;
    int in = 10;

    dbl = in;
    lng = in;

    System.out.println(dbl);
    System.out.println(lng);

//    Explicit

    float a = 21.3476f;
    int b = (int) a + 5;

}

}
