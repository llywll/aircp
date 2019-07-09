package com.obor.aircp.mapper;

import com.obor.aircp.model.HRec;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HRecMapper {
    int deleteByPrimaryKey(String id);

    int insert(HRec record);

    int insertSelective(HRec record);

    HRec selectByPrimaryKey(String id);

    List<HRec> selectAll();

    List<HRec> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    int updateByPrimaryKeySelective(HRec record);

    int updateByPrimaryKey(HRec record);

    int getCount();
}