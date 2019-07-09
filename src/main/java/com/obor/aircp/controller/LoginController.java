package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.SUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {

    @RequestMapping("login")
    @ResponseBody
    public Map login(@RequestParam(value="userName",required = false) String userName,
                     @RequestParam(value="password",required = false) String password,
                     HttpServletRequest request) {
        if (userName != "" & password != "") {
            SUser sUser = sUserService.login(userName, password);
            if (sUser != null) {
                request.getSession().setAttribute("user", sUser);
                return result(SUCCESS,"成功登录");
            }else {
                return result(ERROR,"账户名或密码错误");
            }
        }
        return result(ERROR,"账户名密码不得为空");
    }
}
