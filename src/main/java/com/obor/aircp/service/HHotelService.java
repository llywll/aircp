package com.obor.aircp.service;

import com.obor.aircp.model.HHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HHotelService {
    int deleteById(String id);

    int add(HHotel hHotel);

    HHotel getById(String id);

    List<HHotel> getAll();

    List<HHotel> getByPage(int pstart, int psize);

    int update(HHotel hHotel);

    int getCount();
}
