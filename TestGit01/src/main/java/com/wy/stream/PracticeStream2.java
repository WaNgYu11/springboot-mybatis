package com.wy.stream;

import com.wy.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PracticeStream2 {

    public static void main(String[] args) {


        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(20160001, "KongMing", 20, 1, "土木工程", "武汉大学"));
        stuList.add(new Student(20160002, "BoYue", 21, 2, "信息安全", "武汉大学"));
        stuList.add(new Student(20160003, "XuanDe", 22, 3, "经济管理", "武汉大学"));
        stuList.add(new Student(20160004, "YunChang", 21, 2, "信息安全", "武汉大学"));
        stuList.add(new Student(20161001, "YiDe", 21, 2, "机械与自动化", "华中科技大学"));
        stuList.add(new Student(20161002, "YuanZhi", 23, 4, "土木工程", "华中科技大学"));
        stuList.add(new Student(20161003, "FengXiao", 23, 4, "计算机科学", "华中科技大学"));
        stuList.add(new Student(20162001, "ZhongMou", 22, 3, "土木工程", "浙江大学"));
        stuList.add(new Student(20162002, "LuSu", 23, 4, "计算机科学", "浙江大学"));
        stuList.add(new Student(20163001, "DingFeng", 24, 5, "土木工程", "南京大学"));


        // 1.汇总专业名为土木工程的总人数
        long count = stuList.stream()
                .filter(student -> student.getMajor().equals("土木工程")).count();
        // 2. 汇总专业名为"土木工程"的学生的姓名集合;
        List<String> collect = stuList.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
        for (String str : collect) {
            System.out.println(str);
        }
        System.out.println("================================================================");

        // 3. 返回专业为土木工程+计算机科学的学生的平均年龄;
        Double collect1 = stuList.stream()
                .filter(student -> student.getMajor().equals("土木工程"))
                .filter(student -> student.getMajor().equals("计算机科学"))
                .collect(Collectors.averagingInt(Student::getAge));

        System.out.println(collect1);


    }


}
