package com.obor.aircp.service;

import com.obor.aircp.model.HService;

import java.util.List;

public interface HSerService {
    int deleteById(String id);

    int add(HService hService);

    HService getById(String id);

    List<HService> getAll();

    List<HService> getByPage(int pstart, int psize);


    int update(HService hService);

    int getCount();

}
