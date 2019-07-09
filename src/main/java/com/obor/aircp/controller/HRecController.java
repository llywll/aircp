package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.HRec;
import com.obor.aircp.model.HRec;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rec")
public class HRecController extends BaseController {

    @RequestMapping("getByPage")
    @ResponseBody
    public Map getByPage(@RequestParam(value = "pno", defaultValue = "1") int pno,
                         @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HRec> list = hRecService.getByPage((pno - 1) * psize, psize);
        return result(list, hRecService.getCount(), "");
    }

    @RequestMapping("getAll")
    public Map getAll() {
        List<HRec> list = hRecService.getAll();
        return result(list, hRecService.getCount(), "");
    }

    @RequestMapping("getById")
    public HRec getById(@RequestParam("id") String id) {
        return hRecService.getById(id);
    }

    @RequestMapping("deleteId")
    public Map deleteId(@RequestParam("id") String id) {
        if (hRecService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败，可能是不存在此记录");
    }

    @RequestMapping("upHRec")
    public Map upInfo(@ModelAttribute("HRec") HRec HRec) {
        if (hRecService.update(HRec) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addHRec")
    public Map addHec(@ModelAttribute("HRec") HRec HRec) {
        if (hRecService.add(HRec) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }
}
