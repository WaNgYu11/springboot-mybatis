package com.wy.stream;

import java.util.stream.Stream;

public class TestStreamFindFirstAny {

    public static void main(String[] args) {

        System.out.println(Stream.of("11", "1", "4", "8", "3", "3", "1").findFirst().get());

        System.out.println(Stream.of("11", "1", "4", "8", "3", "3", "1").findAny().get());

    }

}
