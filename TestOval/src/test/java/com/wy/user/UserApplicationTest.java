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


@SpringBootTest
public class UserApplicationTest {


    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;


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
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(User::getUserName, "o")
                .ge(User::getUserAge, 20);
        List<User> userList = this.userMapper.selectList(lambdaQueryWrapper);
        for (User user : userList) {
            System.out.println(user);
        }
    }


}
