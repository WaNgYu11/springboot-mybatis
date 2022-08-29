package com.wy.stream;

import com.wy.entity.Person;
import com.wy.entity.User;

import java.util.stream.Stream;

public class TestStreamReduce {


    public static void main(String[] args) {

        Stream<User> userStream = Stream.of(new User(1, "张三", 18), new User(3, "王五", 22),
                new User(2, "李四", 20));

        Integer reduce = userStream.map(User::getUserAge)
                .reduce(0, (x, y) -> {
                    System.out.println("x:" + x + "-y:" + y);
                    return x + y;
                });
        System.out.println(reduce);

    }


}
