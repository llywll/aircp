package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AdminController extends BaseController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/exit")
    public String exit (HttpServletRequest request, HttpServletResponse response){
        request.getSession().invalidate();
        return "redirect:login";
    }

}
