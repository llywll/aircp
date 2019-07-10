package com.obor.aircp.service;

import com.obor.aircp.model.HOderView;
import com.obor.aircp.model.HOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HOrderService {
    List<HOderView> getByPage(int pstart, int psize);

    List<HOderView> selectByPageTheSorting(@Param("isStart")String isStart, @Param("isDesc")String isDesc,
                                        int pstart, int psize);

    List<HOderView> getAll();



    HOrder getById(String id);

    int deleteById(String id);

    int upOrderStatus(String id,String status);

    int upOrderInfo(HOrder hOrder);

    int addOrderInfo(HOrder hOrder);

    int getCount();

}
