package com.wy.user;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wy.entity.User;
import com.wy.mapper.UserMapper;
import com.wy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class UserApplicationTest {


    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;


    /**
     * LambdaQueryWrapper查询
     */
    @Test
    void testQueryUserAndAdmin3() {


    }


    @Test
    void testQueryUserAndAdmin2() {

        List<User> userList = this.userService.findByUserAndAdmin();
        userList.forEach(System.out::println);

    }


    /**
     * 查询用户mybatis-plus
     */
    @Test
    void testQueryUserAndAdmin() {
        List<User> userList = this.userMapper.selectList(null);
        Integer integer = userList.stream().map(User::getUserAge).reduce(Integer::sum).orElse(1);
        System.out.println(integer);

    }


}
