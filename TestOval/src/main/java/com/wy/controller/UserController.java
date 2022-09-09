package com.wy.controller;


import com.wy.entity.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> userList = this.userService.findByUserAndAdmin();
        model.addAttribute("userList", userList);
        return "user/list";
    }


}
