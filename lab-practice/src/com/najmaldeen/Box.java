package com.najmaldeen;

public class Box {
    int width;
    int length;

    public Box() {
        width = 10;
        length = 10;
    }

    public Box(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        var box = new Box(10,20);
        System.out.println(box.length);
        System.out.println(box.width);
    }

}
