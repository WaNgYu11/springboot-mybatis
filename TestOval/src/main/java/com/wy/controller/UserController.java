package com.wy.controller;


import com.wy.entity.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    @ResponseBody
    public User demo(@Valid User user, BindResult result) {
        this.userService.addUser(user);
        return user;
    }

}
