package com.wy.service;

import com.wy.entity.User;

import java.util.List;

public interface UserService {


    List<User> queryUserAll();

    void addUser(User user);
}
