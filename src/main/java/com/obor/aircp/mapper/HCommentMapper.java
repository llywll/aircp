package com.obor.aircp.mapper;

import com.obor.aircp.model.HComment;

public interface HCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(HComment record);

    int insertSelective(HComment record);

    HComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HComment record);

    int updateByPrimaryKey(HComment record);
}