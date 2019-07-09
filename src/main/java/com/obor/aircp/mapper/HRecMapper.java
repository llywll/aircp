package com.obor.aircp.mapper;

import com.obor.aircp.model.HRec;

import java.util.List;

public interface HRecMapper {
    int deleteByPrimaryKey(String id);

    int insert(HRec record);

    int insertSelective(HRec record);

    HRec selectByPrimaryKey(String id);

    List<HRec> selectByCityId(String CityId);

    int updateByPrimaryKeySelective(HRec record);

    int updateByPrimaryKey(HRec record);
}