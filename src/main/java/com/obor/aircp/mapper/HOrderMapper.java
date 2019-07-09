package com.obor.aircp.mapper;

import com.obor.aircp.model.HOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(HOrder record);

    int insertSelective(HOrder record);

    HOrder selectByPrimaryKey(String id);

    List<HOrder> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    List<HOrder> selectByPageTheSorting(@Param("isStart") String isStart, @Param("isDesc") String isDesc,
                                        @Param("pstart") String pstart, @Param("psize") String psize);

    List<HOrder> selectAll();

    int updateByPrimaryKeySelective(HOrder record);

    int updateByPrimaryKey(HOrder record);

    int updateState(@Param("id") String id, @Param("state") String state);

    Integer getCount();
}