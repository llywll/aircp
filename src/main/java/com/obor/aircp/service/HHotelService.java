package com.obor.aircp.service;

import com.github.pagehelper.PageInfo;
import com.obor.aircp.model.HHotel;
import com.obor.aircp.model.HHotelView;

import java.util.List;

public interface HHotelService {
    int deleteById(String id);

    int add(HHotel hHotel);

    HHotel getById(String id);

    List<HHotel> getAll();

    PageInfo<HHotelView> getByMoney(int minMoney, int maxMoney, int pno, int psize);

    List<HHotel> getByPage(int pstart, int psize);

    int update(HHotel hHotel);

    int getCount();
}
