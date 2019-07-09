package com.obor.aircp.mapper;

import com.obor.aircp.model.HHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HHotelMapper {
    int deleteByPrimaryKey(String id);

    int insert(HHotel record);

    int insertSelective(HHotel record);

    HHotel selectByPrimaryKey(String id);

    List<HHotel> selectAll();

    List<HHotel> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    int updateByPrimaryKeySelective(HHotel record);

    int updateByPrimaryKey(HHotel record);
}