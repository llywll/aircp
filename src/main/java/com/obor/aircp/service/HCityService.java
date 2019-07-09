package com.obor.aircp.service;

import com.obor.aircp.model.HCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HCityService {
    int deleteById(String id);

    int add(HCity hCity);

    HCity getById(String id);

    List<HCity> selectAll();

    List<HCity> selectByPage(int pstart, int psize);

    int updateById(HCity hCity);

    int getCount();
}
