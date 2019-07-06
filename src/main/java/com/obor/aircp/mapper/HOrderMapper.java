package com.obor.aircp.mapper;

import com.obor.aircp.model.HOrder;

public interface HOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(HOrder record);

    int insertSelective(HOrder record);

    HOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HOrder record);

    int updateByPrimaryKey(HOrder record);
}