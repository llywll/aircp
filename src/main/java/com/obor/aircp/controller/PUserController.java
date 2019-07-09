package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.PUser;
import com.obor.aircp.model.SUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/puser")
public class PUserController extends BaseController {

    @RequestMapping("register")
    public PUser register(@ModelAttribute("PUser") PUser pUser) {
        return pUserService.register(pUser);
    }

    @RequestMapping("getByUserId")
    public PUser getByUserId(String id) {
        return pUserService.getById(id);
    }

    @RequestMapping("getAll")
    public Map getAll() {
        List<PUser> list=pUserService.getAll();
        return result(list,pUserService.getCount(),"");
    }
    @RequestMapping("update")
    public Map update(@ModelAttribute("PUser")PUser pUser) {
        if(pUserService.update(pUser)>0)
            return result(SUCCESS,"更新成功");
        return result(ERROR,"更新失败");
    }
    @RequestMapping("deleteById")
    public Map deleteById(String id) {
        if(pUserService.deleteById(id)>0)
            return result(SUCCESS,"删除成功");
        return result(ERROR,"删除失败");
    }
    @RequestMapping("login")
    @ResponseBody
    public Map login(@RequestParam(value="userName",required = false) String userName,
                     @RequestParam(value="password",required = false) String password,
                     HttpServletRequest request) {
        if (userName != "" & password != "") {
            PUser pUser = pUserService.login(userName, password);
            if (pUser != null) {
                request.getSession().setAttribute("puser", pUser);
                return result(SUCCESS,"成功登录");
            }else {
                return result(ERROR,"账户名或密码错误");
            }
        }
        return result(ERROR,"账户名密码不得为空");
    }

}
