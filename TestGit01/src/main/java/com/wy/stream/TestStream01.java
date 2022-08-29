package com.wy.stream;

import java.util.List;
import java.util.stream.Stream;

public class TestStream01 {


    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("11", "1", "4", "8", "3", "3", "1");
        stringStream
                .map(Integer::parseInt)
//                .sorted()
                .sorted((s1,s2)->{
                    return s2.compareTo(s1);
                })
                .distinct()
                .forEach(System.out::println);


    }


}
