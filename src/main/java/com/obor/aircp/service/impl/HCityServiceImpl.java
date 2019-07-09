package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.mapper.HCityMapper;
import com.obor.aircp.model.HCity;
import com.obor.aircp.service.HCityService;

import java.util.List;
import java.util.UUID;

public class HCityServiceImpl extends BaseService implements HCityService {
    @Override
    public int deleteById(String id) {
        return hCityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(HCity hCity) {
        hCity.setId(UUID.randomUUID().toString().replace("-",""));
        return hCityMapper.insertSelective(hCity);
    }

    @Override
    public HCity getById(String id) {
        return hCityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HCity> selectAll() {
        return hCityMapper.selectAll();
    }

    @Override
    public List<HCity> selectByPage(int pstart, int psize) {
        return hCityMapper.selectByPage(pstart,psize);
    }

    @Override
    public int updateById(HCity hCity) {
        return hCityMapper.updateByPrimaryKeySelective(hCity);
    }

    @Override
    public int getCount() {
        return hCityMapper.getCount();
    }
}
