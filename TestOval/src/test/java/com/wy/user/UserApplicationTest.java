package com.wy.user;

import com.wy.entity.User;
import com.wy.mapper.UserMapper;
import com.wy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserApplicationTest {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void testAddUser(){


        User user=new User();
        user.setName("马踏燕mm");
        user.setAge(15);
        user.setEmail("1qq.com");
        this.userService.addUser(user);
        System.out.println("添加成功：===="+user);
    }



}
