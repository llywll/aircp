package com.obor.aircp.service;

import com.obor.aircp.model.PUser;

import java.util.List;

public interface PUserService {
    int deleteById(String id);

    PUser register(PUser pUser);

    PUser getById(String id);

    List<PUser> getAll();

    List<PUser> getByPage(int pstart, int psize);

    PUser getByUserNameAndPassword(String userName, String password);

    int update(PUser pUser);
}
