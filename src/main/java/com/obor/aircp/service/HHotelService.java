package com.obor.aircp.service;

import com.obor.aircp.model.HHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HHotelService {
    int deleteById(String id);

    int insert(HHotel hHotel);

    HHotel selectById(String id);

    List<HHotel> getAll();

    List<HHotel> selectByPage(int pstart, int psize);

    int update(HHotel hHotel);
}
