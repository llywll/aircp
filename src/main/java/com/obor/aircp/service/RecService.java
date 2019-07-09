package com.obor.aircp.service;

import com.obor.aircp.model.HRec;

import java.util.List;

public interface RecService {
    List<HRec> getallrec(String cityid);

    String delrec(String recid);
}
