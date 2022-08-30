package com.wy.stream;

import com.wy.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeStream2 {

    public static void main(String[] args) {


        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(20160001, "KongMing", 20, 1, "土木工程", "武汉大学"));
        stuList.add(new Student(20160002, "BoYue", 15, 2, "信息安全", "武汉大学"));
        stuList.add(new Student(20160003, "XuanDe", 22, 3, "经济管理", "武汉大学"));
        stuList.add(new Student(20160004, "YunChang", 16, 2, "信息安全", "武汉大学"));
        stuList.add(new Student(20161001, "YunChang2", 16, 2, "信息安全", "武汉大学"));
        stuList.add(new Student(20161001, "YiDe", 13, 2, "机械与自动化", "华中科技大学"));
        stuList.add(new Student(20161002, "YuanZhi", 23, 4, "土木工程", "华中科技大学"));
        stuList.add(new Student(20161003, "FengXiao", 23, 4, "计算机科学", "华中科技大学"));
        stuList.add(new Student(20162001, "ZhongMou", 22, 3, "土木工程", "浙江大学"));
        stuList.add(new Student(20162002, "LuSu", 23, 5, "计算机科学", "浙江大学"));
        stuList.add(new Student(20163001, "DingFeng", 13, 5, "土木工程", "南京大学"));

        // 根据Grade和Age两个字段进行分组。

        Map<Integer, Map<String, List<Student>>> map = stuList.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.groupingBy(student -> {
                    return student.getAge() >= 18 ? "成年" : "未成年";
                })));
        map.forEach((k, v) -> {
            System.out.println(k);
            v.forEach((k1, v1) -> {
                System.out.println("\t" + k1 + ":" + v1);
            });
        });


        System.out.println("================================================================");

        /*// 1.汇总专业名为土木工程的总人数
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


        System.out.println("================================================================");


        System.out.println("最大年龄：=" + stuList.stream().max(Comparator.comparing(Student::getAge)).orElse(null));

        System.out.println("平均年龄：=" + stuList.stream().mapToInt(Student::getAge).summaryStatistics().getAverage());
*/
    }


}
