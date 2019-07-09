package com.obor.aircp.service;

import com.obor.aircp.model.HComment;

import java.util.List;

public interface HCommentService {
    int deleteById(String id);

    int add(HComment hComment);

    HComment getById(String id);

    List<HComment> getAll();

    List<HComment> getByPage(int pstart, int psize);

    int update(HComment record);

    int getCount();
}
