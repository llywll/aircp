package com.obor.aircp.mapper;

import com.obor.aircp.model.HRec;

public interface HRecMapper {
    int deleteByPrimaryKey(String id);

    int insert(HRec record);

    int insertSelective(HRec record);

    HRec selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HRec record);

    int updateByPrimaryKey(HRec record);
}