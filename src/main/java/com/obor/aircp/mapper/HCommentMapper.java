package com.obor.aircp.mapper;

import com.obor.aircp.model.HComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(HComment record);

    int insertSelective(HComment record);

    HComment selectByPrimaryKey(String id);

    List<HComment> selectAll();

    List<HComment> selectByPage(@Param("pstart") Integer pstart, @Param("psize") Integer psize);

    int updateByPrimaryKeySelective(HComment record);

    int updateByPrimaryKey(HComment record);

    int getCount();
}