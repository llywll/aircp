package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HRec;
import com.obor.aircp.service.HRecService;

import java.util.List;
import java.util.UUID;

public class HRecServiceImpl extends BaseService implements HRecService {
    @Override
    public int deleteById(String id) {
        return hRecMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HRec hRec) {
        hRec.setId(UUID.randomUUID().toString().replace("-",""));
        return hRecMapper.insertSelective(hRec);
    }

    @Override
    public HRec selectById(String id) {
        return hRecMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HRec> getAll() {
        return hRecMapper.selectAll();
    }

    @Override
    public List<HRec> getByPage(int pstart, int psize) {
        return hRecMapper.selectByPage(pstart,psize);
    }

    @Override
    public int update(HRec hRec) {
        return hRecMapper.updateByPrimaryKeySelective(hRec);
    }
}
