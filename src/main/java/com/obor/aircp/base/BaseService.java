package com.obor.aircp.base;

import com.obor.aircp.mapper.*;
import com.obor.aircp.service.HCityService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected SUserMapper sUserMapper;

    @Autowired
    protected HOrderMapper hOrderMapper;

    @Autowired
    protected HCommentMapper hCommentMapper;

    @Autowired
    protected HHotelMapper hHotelMapper;

    @Autowired
    protected HCityMapper hCityMapper;

    @Autowired
    protected HServiceMapper hServiceMapper;

    @Autowired
    protected HRecMapper hRecMapper;

    @Autowired
    protected PUserMapper pUserMapper;
}


