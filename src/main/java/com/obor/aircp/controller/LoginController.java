package com.obor.aircp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/test")
    public String login(){
        return "index";
    }
}
