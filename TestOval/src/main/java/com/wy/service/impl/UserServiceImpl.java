package com.wy.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wy.entity.User;
import com.wy.mapper.UserMapper;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserAll() {
        return null;
    }

    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }
}
