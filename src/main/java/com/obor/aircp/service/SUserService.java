package com.obor.aircp.service;

import com.obor.aircp.model.SUser;

public interface SUserService {
    SUser login(String userName, String password);

    int register(SUser sUser);

    int getCount();
}
