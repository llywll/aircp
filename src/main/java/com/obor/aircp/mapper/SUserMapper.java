package com.obor.aircp.mapper;

import com.obor.aircp.model.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(String sId);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(String sId);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}