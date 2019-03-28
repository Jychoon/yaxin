package com.yx.serviceproviderheartfailure.service;

import com.yx.serviceproviderheartfailure.entity.PatInfo;
import com.yx.serviceproviderheartfailure.dao.PatInfoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
@Transactional
public class PatInfoService {
    @Autowired
    private PatInfoDao PatInfoDao;
    public HashMap<String, Object> getPatInfo(String orgId, String medRecordId){
       PatInfo patInfo = PatInfoDao.findByOrgIdAndMedRecordId(orgId, medRecordId);
        HashMap<String, Object> patInfoMap = new HashMap<>();
        //String orgId = patInfo.getOrgId();
        patInfoMap.put("orgId",orgId);
        patInfoMap.put("medRecordId",medRecordId);
        String patId = patInfo.getPatId();
        patInfoMap.put("patId",patId);
        String name = patInfo.getName();
        patInfoMap.put("name",name);
        return patInfoMap;
    }
}