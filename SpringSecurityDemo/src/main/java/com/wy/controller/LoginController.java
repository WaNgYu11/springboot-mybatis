package com.wy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){

        return "demo";
    }


}
