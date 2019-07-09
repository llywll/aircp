package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HService;
import com.obor.aircp.service.HSerService;

import java.util.List;
import java.util.UUID;

public class HSerServiceImpl extends BaseService implements HSerService {
    @Override
    public int deleteById(String id) {
        return hServiceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(HService hService) {
        hService.setId(UUID.randomUUID().toString().replace("-",""));
        return hServiceMapper.insertSelective(hService);
    }

    @Override
    public HService getById(String id) {
        return hServiceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HService> getAll() {
        return hServiceMapper.selectAll();
    }

    @Override
    public List<HService> getByPage(int pstart, int psize) {
        return hServiceMapper.selectByPage(pstart,psize);
    }

    @Override
    public int update(HService hService) {
        return hServiceMapper.updateByPrimaryKeySelective(hService);
    }

    @Override
    public int getCount() {
        return hServiceMapper.getCount();
    }
}
