package com.obor.aircp.base;

import com.obor.aircp.mapper.PUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected PUserMapper pUserMapper;
}
