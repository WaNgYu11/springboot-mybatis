package com.wy.stream;

import java.util.stream.Stream;

public class TestStreamMaxMin {

    public static void main(String[] args) {

        System.out.println(Stream.of("11", "1", "4", "8", "3", "3", "1")
                .map(Integer::parseInt)
                .max((o1, o2) -> o1.compareTo(o2)).get());


        System.out.println(Stream.of("11", "1", "4", "8", "3", "3", "1")
                .map(Integer::parseInt)
                .min((o1, o2) -> o1.compareTo(o2)).get());


    }

}
