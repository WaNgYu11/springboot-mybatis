package com.wy.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.entity.User;

import java.util.List;

public interface UserService extends IService<User> {


    List<User> findByUserAndAdmin();

}
