package com.obor.aircp.mapper;

import com.obor.aircp.model.PUser;

public interface PUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(PUser record);

    int insertSelective(PUser record);

    PUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PUser record);

    int updateByPrimaryKey(PUser record);
}