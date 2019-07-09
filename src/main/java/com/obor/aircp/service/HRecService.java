package com.obor.aircp.service;

import com.obor.aircp.model.HRec;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HRecService {
    int deleteById(String id);

    int insert(HRec hRec);

    HRec selectById(String id);

    List<HRec> getAll();

    List<HRec> getByPage(int pstart, int psize);

    int update(HRec hRec);
}
