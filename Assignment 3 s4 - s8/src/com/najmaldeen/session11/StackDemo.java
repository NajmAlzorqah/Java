package com.najmaldeen.session11;

// Using the generic stack class
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(10);
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
