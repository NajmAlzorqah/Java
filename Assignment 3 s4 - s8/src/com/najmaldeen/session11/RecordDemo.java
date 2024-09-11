package com.najmaldeen.session11;

record Point(int x, int y) {}
public class RecordDemo {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        System.out.println("x = " + point.x());
        System.out.println("y = " + point.y());
    }
}