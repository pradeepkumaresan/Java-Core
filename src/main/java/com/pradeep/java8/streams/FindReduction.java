package com.pradeep.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindReduction {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream2 = ints.stream();

        System.out.println(stream1.findFirst().get());
        System.out.println(stream2.findAny().get());
    }
}
