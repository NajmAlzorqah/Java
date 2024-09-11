package com.najmaldeen.session11;

// Generic stack class
public class Stack<E> {
    private E[] elements;
    private int size;
    public Stack(int capacity) {
        elements = (E[]) new Object[capacity];
    }
    public void push(E element) {
        elements[size++] = element;
    }
    public E pop() {
        return elements[--size];
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
