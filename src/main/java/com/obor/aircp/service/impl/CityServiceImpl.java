package com.obor.aircp.service.impl;

import com.obor.aircp.mapper.HCityMapper;
import com.obor.aircp.model.HCity;
import com.obor.aircp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class CityServiceImpl implements CityService {

    @Autowired
    HCityMapper hCtiyMapper;
    @Override
    public List<HCity> getallcity() {

        return hCtiyMapper.selectAllcity();
    }

    @Override
    public  int addcityname(HCity hCity){
        hCity.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.println(hCity.toString());
        return hCtiyMapper.insertSelective(hCity);
    }



}
