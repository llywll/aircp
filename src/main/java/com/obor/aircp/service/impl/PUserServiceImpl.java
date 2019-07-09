package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.PUser;
import com.obor.aircp.service.PUserService;

import java.util.List;
import java.util.UUID;

public class PUserServiceImpl extends BaseService implements PUserService {
    @Override
    public int deleteById(String id) {
        return pUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PUser register(PUser pUser) {
        pUser.setId(UUID.randomUUID().toString().replace("-",""));
        if(pUserMapper.insertSelective(pUser)>0)
            return pUser;
        return null;
    }

    @Override
    public PUser getById(String id) {
        return pUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PUser> getAll() {
        return pUserMapper.selectAll();
    }

    @Override
    public List<PUser> getByPage(int pstart, int psize) {
        return pUserMapper.selectByPage(pstart,psize);
    }

    @Override
    public PUser getByUserNameAndPassword(String userName, String password) {
        return pUserMapper.selectByUserNameAndPassword(userName,password);
    }

    @Override
    public int update(PUser pUser) {
        return pUserMapper.updateByPrimaryKeySelective(pUser);
    }
}
