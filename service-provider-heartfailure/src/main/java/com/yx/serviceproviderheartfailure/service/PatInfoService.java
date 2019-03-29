package com.yx.serviceproviderheartfailure.service;

import com.yx.serviceproviderheartfailure.entity.PatInfo;
import com.yx.serviceproviderheartfailure.dao.PatInfoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Date;

@Service
@Transactional
public class PatInfoService {
    @Autowired
    private PatInfoDao PatInfoDao;
    public HashMap<String, Object> getPatInfo(String orgId, String medRecordId){

        PatInfo patInfo = PatInfoDao.findByOrgIdAndMedRecordId(orgId, medRecordId);

        HashMap<String, Object> patInfoMap = new HashMap<>();
        if (patInfo ==null) {
            patInfoMap.put("ERROR","No result");
            return patInfoMap;
        }
        //String orgId = patInfo.getOrgId();
        patInfoMap.put("orgId",patInfo.getOrgId());
        patInfoMap.put("medRecordId",patInfo.getOrgId());
        patInfoMap.put("patId",patInfo.getPatId());
        patInfoMap.put("name",patInfo.getName());
        patInfoMap.put("sex",patInfo.getSex());
        patInfoMap.put("birthDate",patInfo.getBirthDate());
        patInfoMap.put("phoneNumber",patInfo.getPhoneNumber());
        patInfoMap.put("insurType",patInfo.getInsurType());
        patInfoMap.put("insur_provider",patInfo.getInsurProvider());
        patInfoMap.put("IDCardNum",patInfo.getIDCardNum());
        patInfoMap.put("firstVisitTime",patInfo.getFirstVisitTime());
        patInfoMap.put("inHosTime",patInfo.getInHosTime());
        patInfoMap.put("symptom",patInfo.getSymptom());
        patInfoMap.put("patFrom",patInfo.getPatFrom());
        patInfoMap.put("valvularAblation",patInfo.getValvularAblation());
        patInfoMap.put("atrialFibType",patInfo.getAtrialFibType());
        patInfoMap.put("otherMalady",patInfo.getOtherMalady());
        patInfoMap.put("name",patInfo.getScR());
        patInfoMap.put("SUM",patInfo.getSUM());
        patInfoMap.put("GFR",patInfo.getGFR());
        patInfoMap.put("CHA2DS2VASc",patInfo.getCHA2DS2VASc());
        patInfoMap.put("HASBLED",patInfo.getHASBLED());
        patInfoMap.put("wheIVSDCC",patInfo.getWheIVSDCC());
        patInfoMap.put("pastAntiarrhythmic",patInfo.getPastAntiarrhythmic());
        patInfoMap.put("nowAntiarrhythmic",patInfo.getNowAntiarrhythmic());
        patInfoMap.put("pastAntithrombotic",patInfo.getPastAntithrombotic());
        patInfoMap.put("nowAntithrombotic",patInfo.getNowAntithrombotic());
        patInfoMap.put("wheINRMonitor",patInfo.getWheINRMonitor());
        patInfoMap.put("pastWheINRStandard",patInfo.getPastWheINRStandard());
        patInfoMap.put("optInHos",patInfo.getOptInHos());
        patInfoMap.put("wheINRStandard",patInfo.getWheINRStandard());
        patInfoMap.put("rhythmLeaveHos",patInfo.getRhythmLeaveHos());
        patInfoMap.put("ACEMedication",patInfo.getACEMedication());
        patInfoMap.put("statinsMedication",patInfo.getStatinsMedication());
        patInfoMap.put("totalDaysInHos",patInfo.getTotalDaysInHos());
        patInfoMap.put("hospitalizationExpenses",patInfo.getHospitalizationExpenses());
        patInfoMap.put("lastModTime",patInfo.getLastModTime());
        patInfoMap.put("lastModPerson",patInfo.getLastModPerson());
        patInfoMap.put("embolismFlag",patInfo.getEmbolismFlag());
        patInfoMap.put("hemorrhageFlag",patInfo.getHemorrhageFlag());
        patInfoMap.put("haemorrhageInHosFlag",patInfo.getHaemorrhageInHosFlag());
        patInfoMap.put("currentPercent",patInfo.getCurrentPercent());
        patInfoMap.put("outpatientDate",patInfo.getOutpatientDate());
        patInfoMap.put("dangerPoints",patInfo.getDangerPoints());
        patInfoMap.put("outOrInHos",patInfo.getOutOrInHos());
        patInfoMap.put("disease",patInfo.getDisease());
        patInfoMap.put("leftEmbolismFlag",patInfo.getLeftEmbolismFlag());
        patInfoMap.put("leftEmbolism",patInfo.getLeftEmbolism());
        patInfoMap.put("deleteFlag",patInfo.getDeleteFlag());
        patInfoMap.put("deletePerson",patInfo.getDeletePerson());
        patInfoMap.put("deleteTime",patInfo.getDeleteTime());

        return patInfoMap;
    }
}