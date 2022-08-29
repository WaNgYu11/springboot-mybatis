package com.wy.stream;

import com.wy.entity.Person;
import com.wy.entity.User;

import java.util.stream.Stream;

public class TestStreamDistinct {


    public static void main(String[] args) {

        Stream<User> userStream = Stream.of(new User(1, "张三", 18), new User(1, "张三", 18),
                new User(2, "李四", 20));
        userStream
                .distinct()
                .forEach(System.out::println);


    }


}
