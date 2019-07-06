package com.obor.aircp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/test")
    public String login(){
        //这是一个测试拦截用的controller 可删掉
        return "index";
    }
}
