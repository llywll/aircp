package com.obor.aircp.mapper;

import com.obor.aircp.model.HHotel;
import com.obor.aircp.model.HHotelView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HHotelMapper {
    int deleteByPrimaryKey(String id);

    int insert(HHotel record);

    int insertSelective(HHotel record);

    HHotel selectByPrimaryKey(String id);

    List<HHotel> selectAll();

    List<HHotel> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    List<HHotelView> selectByMoney(@Param("minMoney") Integer minMoney, @Param("maxMoney") Integer maxMoney);

    int updateByPrimaryKeySelective(HHotel record);

    int updateByPrimaryKey(HHotel record);

    int getCount();
}