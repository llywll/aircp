package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.PUser;
import com.obor.aircp.service.PUserService;

public class PUserServiceImpl extends BaseService implements PUserService {
    @Override
    public PUser login(String userName, String passwprd) {
        return pUserMapper.selectByUserNameAndPassword(userName,passwprd);
    }
}
