package com.obor.aircp.service.impl;

import com.obor.aircp.mapper.HRecMapper;
import com.obor.aircp.model.HRec;
import com.obor.aircp.service.RecService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class RecServieImpl implements RecService {
    @Autowired
    HRecMapper hRecMapper;

    @Override
    public List<HRec> getallrec(String cityid) {

        return hRecMapper.selectByCityId(cityid);
    }

    @Override
    public  int delrec(String recid){
        return hRecMapper.deleteByPrimaryKey(recid);
    }

    @Override
    public int addrec(HRec hrec) {
        hrec.setId(UUID.randomUUID().toString().replace("-",""));
        return hRecMapper.insert(hrec);
    }


}
