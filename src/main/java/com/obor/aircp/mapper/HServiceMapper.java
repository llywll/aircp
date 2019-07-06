package com.obor.aircp.mapper;

import com.obor.aircp.model.HService;

public interface HServiceMapper {
    int deleteByPrimaryKey(String id);

    int insert(HService record);

    int insertSelective(HService record);

    HService selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HService record);

    int updateByPrimaryKey(HService record);
}