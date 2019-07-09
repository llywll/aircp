package com.obor.aircp.service.impl;

import com.obor.aircp.mapper.HRecMapper;
import com.obor.aircp.model.HRec;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecServieImpl {
    @Autowired
    HRecMapper hRecMapper;


    public List<HRec> getallrec(String cityid) {

        return hRecMapper.selectByCityId(cityid);
    }

    public  int delrec(String recid){
        return hRecMapper.deleteByPrimaryKey(recid);
    }
}
