package com.obor.aircp.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.obor.aircp.base.BaseController;
import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HOderView;
import com.obor.aircp.model.HOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/order")
public class HOrderController extends BaseController {

    @RequestMapping("getByPage")
    @ResponseBody
    public Map getByPage(@RequestParam(value = "pno", defaultValue = "1") int pno,
                         @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HOderView> list = hOrderService.getByPage((pno - 1) * psize, psize);
        return result(list, hOrderService.getCount(), "");
    }

    @RequestMapping("getByPageTS")
    @ResponseBody
    public Map getByPageTheSorting(
            @RequestParam(value = "isStart", defaultValue = "true") String isStart,
            @RequestParam(value = "isDesc", defaultValue = "false") String isDesc,
            @RequestParam(value = "pno", defaultValue = "1") int pno,
            @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HOderView> list = hOrderService.selectByPageTheSorting(isStart,isDesc,(pno - 1) * psize, psize);
        return result(list, hOrderService.getCount(), "");

    }

    @RequestMapping("getAll")
    @ResponseBody
    public Map getAll() {
        List<HOderView> list = hOrderService.getAll();
        return result(list, hOrderService.getCount(), "");
    }

    @RequestMapping("getById")
    @ResponseBody
    public HOrder getById(@RequestParam("id") String id) {
        return hOrderService.getById(id);
    }

    @RequestMapping("deleteId")
    @ResponseBody
    public Map deleteId(@RequestParam("id") String id) {
        if (hOrderService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败，可能是不存在此记录");
    }

    @RequestMapping("upStatus")
    @ResponseBody
    public Map upStatus(@RequestParam("id") String id, @RequestParam("status") String status) {
        if (hOrderService.upOrderStatus(id, status) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败，可能是不存在此记录");
    }

    @RequestMapping("upInfo")
    @ResponseBody
    public Map upInfo(@ModelAttribute("HOrder") HOrder hOrder) {
        if (hOrderService.upOrderInfo(hOrder) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addOrder")
    @ResponseBody
    public Map addOrder(@ModelAttribute("HOrder") HOrder hOrder) {
        if (hOrderService.addOrderInfo(hOrder) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }
}
