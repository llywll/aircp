package com.obor.aircp.mapper;

import com.obor.aircp.model.HService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HServiceMapper {
    int deleteByPrimaryKey(String id);

    int insert(HService record);

    int insertSelective(HService record);

    HService selectByPrimaryKey(String id);

    List<HService> selectAll();

    List<HService> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);


    int updateByPrimaryKeySelective(HService record);

    int updateByPrimaryKey(HService record);

    int getCount();
}