package com.najmaldeen;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next; // this object data type is null if there is not any initial value
        // and it stores the address of the second node in the linked list
        public Node (int value){
            this.value = value;
        }

    }

    private Node first;// item in the linked list
    private Node last;// item in the linked list
    private int size;

    public void addLast(int item){
        var node = new Node(item);
        // if the list is empty or not
        if (isEmpty()){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst ( int item){
        var node = new Node(item);
        if (isEmpty()){
            first = node;
            last = node;
        }else {
            node.next = first;
            first = node;
        }
        size ++;
    }
    private boolean isEmpty(){
        return first == null;
    }

    // O(n)
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item )
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        // [10 -> 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var second = first.next; // 20
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){
        // [10 -> 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current !=null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //O(1)
    public int size(){
        return  size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current !=null){
            array[index] =current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        // [ 10 -> 20 -> 30]
        //   p      c     n
        //   n = c.next
        // c.next = p
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next; // to make it ahead than the a.next address
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;


    }
}
