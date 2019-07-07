package com.obor.aircp.mapper;

import com.obor.aircp.model.PUser;
import org.apache.ibatis.annotations.Param;

public interface PUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(PUser record);

    int insertSelective(PUser record);

    PUser selectByPrimaryKey(String id);

    PUser selectByUserNameAndPassword(@Param("userName")String userName, @Param("password")String password);

    int updateByPrimaryKeySelective(PUser record);

    int updateByPrimaryKey(PUser record);
}