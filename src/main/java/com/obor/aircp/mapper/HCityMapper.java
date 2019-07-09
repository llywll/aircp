package com.obor.aircp.mapper;

import com.obor.aircp.model.HCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HCityMapper {
    int deleteByPrimaryKey(String id);

    int insert(HCity record);

    int insertSelective(HCity record);

    HCity selectByPrimaryKey(String id);

    List<HCity> selectAll();

    List<HCity> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    int updateByPrimaryKeySelective(HCity record);

    int updateByPrimaryKey(HCity record);
}