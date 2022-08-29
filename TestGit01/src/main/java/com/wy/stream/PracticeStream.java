package com.wy.stream;

import com.wy.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PracticeStream {

    public static void main(String[] args) {

        //定义两个集合,然后在集合中存储多个用户名称。然后完成如下的操作:
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("杨天真");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");
        // 1.第一个队伍只保留姓名长度为3的成员
        // 2.第一个队伍筛选之后只要前3个人
        Stream<String> man = manList.stream()
                .filter(name -> name.length() == 3)
                .limit(3);
        // 3.第二个队伍只要姓张的成员
        // 4.第二个队伍筛选之后不要前两个人
        Stream<String> woman = womanList.stream()
                .filter(name -> name.startsWith("杨"))
                .skip(2);
        // 5.将两个队伍合并为一个队伍
        // 6.根据姓名创建Person对象
        // 7.打印整个队伍的Person信息
        Stream.concat(man, woman)
                .map(Person::new)
                .forEach(System.out::println);


    }

}
