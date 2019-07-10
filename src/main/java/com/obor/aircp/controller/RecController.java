package com.obor.aircp.controller;

import com.obor.aircp.model.HCity;
import com.obor.aircp.model.HRec;
import com.obor.aircp.service.CityService;
import com.obor.aircp.service.RecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RecController {

    @Autowired
    CityService cityService;
    @Autowired
    RecService recService;


    //传出城市列表
    @RequestMapping("/getallcity")
    public ModelAndView getallcity(Model model){
        ModelAndView modelAndView=new ModelAndView();
        List<HCity> citylist=cityService.getallcity();
        //modelAndView.getModelMap().addAttribute("citylist",cityService.getallcity());
        model.addAttribute("citylist",citylist);
        System.out.println(cityService.getallcity());
        modelAndView.setViewName("rec_info/rec_first");
        return modelAndView;
    }

    //增加城市
    @RequestMapping("/addcity")
    public String addcity(HCity hCity){
        System.out.println(hCity);
        cityService.addcityname(hCity);
        return "redirect:/reclistbycity";
    }

    //通过cityid查询Rec列表
    @RequestMapping("/reclistbycity")
    public ModelAndView getallrec(HttpServletRequest an){
        ModelAndView modelAndView=new ModelAndView();
        String cityid=an.getParameter("cityid");
        System.out.println(cityid);
        List<HRec> reclist=recService.getallrec(cityid);
        System.out.println(reclist);
        modelAndView.getModelMap().addAttribute("reclist",reclist);
        modelAndView.setViewName("rec_info/rec_first");
        return modelAndView;
    }
    //增加rec
    @RequestMapping("/addrec")
    public String addrec(HRec hRec,HttpServletRequest request){
        hRec.setId("sdfdsf");
        hRec.setCityId(request.getParameter("cityid"));
        hRec.setCityRecName(request.getParameter("rec_name"));
        hRec.setCityRecContext(request.getParameter("rec_context"));
        hRec.setCityComment(request.getParameter("rec_comment"));
        System.out.println(hRec);
        recService.addrec(hRec);
        return "redirect:/reclistbycity";
    }
    //删除Rec
    @RequestMapping("/deleterec")
    public String delrec(HttpServletRequest an){
        String recid=an.getParameter("recid");
        recService.delrec(recid);
        return "redirect:/reclistbycity";
    }

}
