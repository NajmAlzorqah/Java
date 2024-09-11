package com.najmaldeen.session11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();
        stream.filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
