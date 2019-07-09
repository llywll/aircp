package com.obor.aircp.controller;

import com.obor.aircp.base.BaseController;
import com.obor.aircp.model.HComment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comment")
public class HCommentController extends BaseController {

    @RequestMapping("getByPage")
    @ResponseBody
    public Map getByPage(@RequestParam(value = "pno", defaultValue = "1") int pno,
                         @RequestParam(value = "psize", defaultValue = "10") int psize) {
        List<HComment> list = hCommentService.getByPage((pno - 1) * psize, psize);
        return result(list, hCommentService.getCount(), "");
    }

    @RequestMapping("getAll")
    public Map getAll() {
        List<HComment> list = hCommentService.getAll();
        return result(list, hCommentService.getCount(), "");
    }

    @RequestMapping("getById")
    public HComment getById(@RequestParam("id") String id) {
        return hCommentService.getById(id);
    }

    @RequestMapping("deleteId")
    public Map deleteId(@RequestParam("id") String id) {
        if (hCommentService.deleteById(id) > 0)
            return result(SUCCESS, "删除成功");
        return result(ERROR, "删除失败");
    }

    @RequestMapping("upHComment")
    public Map upInfo(@ModelAttribute("HComment") HComment HComment) {
        if (hCommentService.update(HComment) > 0)
            return result(SUCCESS, "更新成功");
        return result(ERROR, "更新失败");
    }

    @RequestMapping("addHComment")
    public Map addHec(@ModelAttribute("HComment") HComment HComment) {
        if (hCommentService.add(HComment) > 0)
            return result(SUCCESS, "新增成功");
        return result(ERROR, "新增失败");
    }
    
}
