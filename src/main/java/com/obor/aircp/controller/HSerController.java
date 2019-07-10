package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.HService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/service")
public class HSerController extends BaseController {

    @RequestMapping("getByPage")
    @ResponseBody
    public Map getByPage(@RequestParam(value = "pno", defaultValue = "1") int pno,
                         @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HService> list = hSerService.getByPage((pno - 1) * psize, psize);
        return result(list, hSerService.getCount(), "");
    }

    @RequestMapping("getAll")
    @ResponseBody
    public Map getAll() {
        List<HService> list = hSerService.getAll();
        return result(list, hSerService.getCount(), "");
    }

    @RequestMapping("getById")
    @ResponseBody
    public HService getById(@RequestParam("id") String id) {
        return hSerService.getById(id);
    }

    @RequestMapping("deleteId")
    @ResponseBody
    public Map deleteId(@RequestParam("id") String id) {
        if (hSerService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败");
    }

    @RequestMapping("upHService")
    @ResponseBody
    public Map upInfo(@ModelAttribute("HService") HService HService) {
        if (hSerService.update(HService) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addHService")
    @ResponseBody
    public Map addHec(@ModelAttribute("HService") HService HService) {
        if (hSerService.add(HService) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }


}
