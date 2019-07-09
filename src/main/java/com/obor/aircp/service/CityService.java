package com.obor.aircp.service;

import com.obor.aircp.model.HCity;

import java.util.List;

public interface CityService {

     List<HCity> getallcity();

    int addcityname(HCity record);
}
