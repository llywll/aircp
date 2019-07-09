package com.obor.aircp.base;

import com.obor.aircp.service.HOrderService;
import com.obor.aircp.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected final String SUCCESS = "success";
    protected final String ERROR = "error";

    @Autowired
    protected SUserService sUserService;

    @Autowired
    protected HOrderService hOrderService;

    protected Map<String, Object> result (String state, String message){
        Map<String, Object> map = new HashMap<>();
        map.put("state", state);
        map.put("message", message);
        return map;
    }

    protected Map<String, Object> result (Collection collection, int count, String msg){
        Map<String, Object> map = new HashMap<>();
        map.put("data", collection);
        map.put("code",0);
        map.put("msg",msg);
        map.put("count", count);
        return map;
    }
}
