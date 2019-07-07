package com.obor.aircp.service;

import com.obor.aircp.model.PUser;

public interface PUserService {
    PUser login(String userName, String passwprd);
}
