package com.wy.stream;

import com.sun.media.sound.SoftTuning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream01 {


    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.forEach(integer -> System.out.println(Math.abs(integer)));


    }

    static class TestStream02{

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            numbers.stream().map(num->num*num).collect(Collectors.toList()).forEach(System.out::println);
        }

    }


}
