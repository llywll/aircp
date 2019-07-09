package com.obor.aircp.mapper;

import com.obor.aircp.model.HCity;

import java.util.List;

public interface HCityMapper {
    int deleteByPrimaryKey(String id);

    int insert(HCity record);

    int insertSelective(HCity record);

    HCity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HCity record);

    int updateByPrimaryKey(HCity record);

    List<HCity> selectAllcity();

}