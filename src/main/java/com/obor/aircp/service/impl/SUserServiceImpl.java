package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.SUser;
import com.obor.aircp.service.SUserService;

import java.util.UUID;

public class SUserServiceImpl extends BaseService implements SUserService {
    @Override
    public SUser login(String userName, String password) {
        return sUserMapper.selectByUserNameAndPassword(userName,password);
    }

    @Override
    public int register(SUser sUser) {
        sUser.setsId(UUID.randomUUID().toString().replace("-",""));
        return 0;
    }

    @Override
    public int getCount() {
        return sUserMapper.getCount();
    }
}
