package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HOrder;
import com.obor.aircp.service.HOrderService;

import java.util.List;
import java.util.UUID;

public class HOrderServiceImpl extends BaseService implements HOrderService {
    @Override
    public List<HOrder> getByPage(int pstart, int psize) {
        return hOrderMapper.selectByPage(pstart,psize);
    }

    @Override
    public List<HOrder> selectByPageTheSorting(String isStart, String isDesc, int pstart, int psize) {
        return hOrderMapper.selectByPageTheSorting(isStart,isDesc,pstart,psize);
    }

    @Override
    public List<HOrder> getAll(){
        return hOrderMapper.selectAll();
    }
    @Override
    public HOrder getById(String id){
        return hOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(String id) {
        return hOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int upOrderStatus(String id, String status) {
        return hOrderMapper.updateState(id,status);
    }

    @Override
    public int upOrderInfo(HOrder hOrder) {
        return hOrderMapper.updateByPrimaryKeySelective(hOrder);
    }

    @Override
    public int addOrderInfo(HOrder hOrder) {
        hOrder.setId(UUID.randomUUID().toString().replace("-",""));
        return hOrderMapper.insertSelective(hOrder);
    }

    @Override
    public int getCount() {
        return hOrderMapper.getCount();
    }
}
