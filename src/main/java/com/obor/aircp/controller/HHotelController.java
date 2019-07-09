package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.HHotel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hotel")
public class HHotelController extends BaseController {

    @RequestMapping("getByPage")
    @ResponseBody
    public Map getByPage(@RequestParam(value = "pno", defaultValue = "1") int pno,
                         @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HHotel> list = hHotelService.getByPage((pno - 1) * psize, psize);
        return result(list, hHotelService.getCount(), "");
    }

    @RequestMapping("getAll")
    public Map getAll() {
        List<HHotel> list = hHotelService.getAll();
        return result(list, hHotelService.getCount(), "");
    }

    @RequestMapping("getById")
    public HHotel getById(@RequestParam("id") String id) {
        return hHotelService.getById(id);
    }

    @RequestMapping("deleteId")
    public Map deleteId(@RequestParam("id") String id) {
        if (hHotelService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败");
    }

    @RequestMapping("upHHotel")
    public Map upInfo(@ModelAttribute("HHotel") HHotel HHotel) {
        if (hHotelService.update(HHotel) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addHHotel")
    public Map addHec(@ModelAttribute("HHotel") HHotel HHotel) {
        if (hHotelService.add(HHotel) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }
}
