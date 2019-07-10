package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.HHotel;
import com.obor.aircp.model.HHotelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public Map getAll(
            @RequestParam(value = "pno", defaultValue = "1", required = false) int pno,
            @RequestParam(value = "psize", defaultValue = "10", required = false) int psize) {
        List<HHotel> list = hHotelService.getAll();
        return result(list, hHotelService.getCount(), "");
    }

    @RequestMapping("getById")
    @ResponseBody
    public HHotel getById(@RequestParam("id") String id) {
        return hHotelService.getById(id);
    }

    @RequestMapping("getByMoney")
    @ResponseBody
    public Map getByMoney(@RequestParam("minMoney") int minMoney,
                          @RequestParam("maxMoney") int maxMoney,
                          @RequestParam(value = "pno", defaultValue = "1", required = false) int pno,
                          @RequestParam(value = "psize", defaultValue = "10", required = false) int psize) {
        List<HHotelView> list = hHotelService.getByMoney(minMoney, maxMoney, pno, psize).getList();
        return result(list, list.size(), "");
    }

    @RequestMapping("deleteId")
    @ResponseBody
    public Map deleteId(@RequestParam("id") String id) {
        if (hHotelService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败");
    }

    @RequestMapping("upHHotel")
    @ResponseBody
    public Map upInfo(@ModelAttribute("HHotel") HHotel HHotel) {
        if (hHotelService.update(HHotel) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addHHotel")
    @ResponseBody
    public Map addHec(@ModelAttribute("HHotel") HHotel HHotel) {
        if (hHotelService.add(HHotel) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }
}
