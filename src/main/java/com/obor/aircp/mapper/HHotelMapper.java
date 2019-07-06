package com.obor.aircp.mapper;

import com.obor.aircp.model.HHotel;

public interface HHotelMapper {
    int deleteByPrimaryKey(String id);

    int insert(HHotel record);

    int insertSelective(HHotel record);

    HHotel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HHotel record);

    int updateByPrimaryKey(HHotel record);
}