package com.obor.aircp.mapper;

import com.obor.aircp.model.SUser;
import org.apache.ibatis.annotations.Param;

public interface SUserMapper {
    int deleteByPrimaryKey(String sId);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(String sId);

    SUser selectByUserNameAndPassword(
            @Param("sUserName") String sUserName, @Param("sPassword") String sPassword);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);

    int getCount();
}