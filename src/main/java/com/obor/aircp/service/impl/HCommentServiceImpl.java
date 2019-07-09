package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HComment;
import com.obor.aircp.service.HCommentService;

import java.util.List;
import java.util.UUID;

public class HCommentServiceImpl extends BaseService implements HCommentService {
    @Override
    public int deleteById(String id) {
        return hCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HComment hComment) {
        hComment.setId(UUID.randomUUID().toString().replace("-",""));
        return hCommentMapper.insertSelective(hComment);
    }

    @Override
    public HComment getById(String id) {
        return hCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HComment> getAll() {
        return hCommentMapper.selectAll();
    }

    @Override
    public List<HComment> getByPage(int pstart, int psize) {
        return hCommentMapper.selectByPage(pstart,psize);
    }

    @Override
    public int updateById(HComment hComment) {
        return updateById(hComment);
    }
}
