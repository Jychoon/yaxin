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
        //String orgId = patInfo.getOrgId();
        patInfoMap.put("orgId",orgId);
        patInfoMap.put("medRecordId",medRecordId);
        String patId = patInfo.getPatId();
        patInfoMap.put("patId",patId);
        String name = patInfo.getName();
        patInfoMap.put("name",name);
        String sex = patInfo.getSex();
        patInfoMap.put("sex",sex);
        Date birthDate = patInfo.getBirthDate();
        patInfoMap.put("birthDate",birthDate);
        String phoneNumber = patInfo.getPhoneNumber();
        patInfoMap.put("phoneNumber",phoneNumber);
        String insurType = patInfo.getInsurType();
        patInfoMap.put("insurType",insurType);
        String insurProvider = patInfo.getInsurProvider();
        patInfoMap.put("insur_provider",insurProvider);
        String IDCardNum = patInfo.getIDCardNum();
        patInfoMap.put("IDCardNum",IDCardNum);
        Date firstVisitTime = patInfo.getFirstVisitTime();
        patInfoMap.put("firstVisitTime",firstVisitTime);
        Date inHosTime = patInfo.getInHosTime();
        patInfoMap.put("inHosTime",inHosTime);
        String symptom = patInfo.getSymptom();
        patInfoMap.put("symptom",symptom);
        String patFrom = patInfo.getPatFrom();
        patInfoMap.put("patFrom",patFrom);
        String valvularAblation = patInfo.getValvularAblation();
        patInfoMap.put("valvularAblation",valvularAblation);
        String atrialFibType = patInfo.getAtrialFibType();
        patInfoMap.put("atrialFibType",atrialFibType);
        String otherMalady = patInfo.getOtherMalady();
        patInfoMap.put("otherMalady",otherMalady);
        Integer ScR = patInfo.getScR();
        patInfoMap.put("name",ScR);
        Float SUM = patInfo.getSUM();
        patInfoMap.put("SUM",SUM);
        Integer GFR = patInfo.getGFR();
        patInfoMap.put("GFR",GFR);
        Integer CHA2DS2VASc = patInfo.getCHA2DS2VASc();
        patInfoMap.put("CHA2DS2VASc",CHA2DS2VASc);
        Integer HASBLED = patInfo.getHASBLED();
        patInfoMap.put("HASBLED",HASBLED);
        Integer wheIVSDCC = patInfo.getWheIVSDCC();
        patInfoMap.put("wheIVSDCC",wheIVSDCC);
        String pastAntiarrhythmic = patInfo.getPastAntiarrhythmic();
        patInfoMap.put("pastAntiarrhythmic",pastAntiarrhythmic);
        String nowAntiarrhythmic = patInfo.getNowAntiarrhythmic();
        patInfoMap.put("nowAntiarrhythmic",nowAntiarrhythmic);
        String pastAntithrombotic = patInfo.getPastAntithrombotic();
        patInfoMap.put("pastAntithrombotic",pastAntithrombotic);
        String nowAntithrombotic = patInfo.getNowAntithrombotic();
        patInfoMap.put("nowAntithrombotic",nowAntithrombotic);
        Integer wheINRMonitor = patInfo.getWheINRMonitor();
        patInfoMap.put("wheINRMonitor",wheINRMonitor);
        Integer pastWheINRStandard = patInfo.getPastWheINRStandard();
        patInfoMap.put("pastWheINRStandard",pastWheINRStandard);
        String optInHos = patInfo.getOptInHos();
        patInfoMap.put("optInHos",optInHos);
        Integer wheINRStandard = patInfo.getWheINRStandard();
        patInfoMap.put("wheINRStandard",wheINRStandard);
        String rhythmLeaveHos = patInfo.getRhythmLeaveHos();
        patInfoMap.put("rhythmLeaveHos",rhythmLeaveHos);
        String ACEMedication = patInfo.getACEMedication();
        patInfoMap.put("ACEMedication",ACEMedication);
        String statinsMedication = patInfo.getStatinsMedication();
        patInfoMap.put("statinsMedication",statinsMedication);
        Integer totalDaysInHos = patInfo.getTotalDaysInHos();
        patInfoMap.put("totalDaysInHos",totalDaysInHos);
        Float hospitalizationExpenses = patInfo.getHospitalizationExpenses();
        patInfoMap.put("hospitalizationExpenses",hospitalizationExpenses);
        Date lastModTime = patInfo.getLastModTime();
        patInfoMap.put("lastModTime",lastModTime);
        String lastModPerson = patInfo.getLastModPerson();
        patInfoMap.put("lastModPerson",lastModPerson);
        Integer embolismFlag = patInfo.getEmbolismFlag();
        patInfoMap.put("embolismFlag",embolismFlag);
        Integer hemorrhageFlag = patInfo.getHemorrhageFlag();
        patInfoMap.put("hemorrhageFlag",hemorrhageFlag);
        Integer haemorrhageInHosFlag = patInfo.getHaemorrhageInHosFlag();
        patInfoMap.put("haemorrhageInHosFlag",haemorrhageInHosFlag);
        Integer currentPercent = patInfo.getCurrentPercent();
        patInfoMap.put("currentPercent",currentPercent);
        Date outpatientDate = patInfo.getOutpatientDate();
        patInfoMap.put("outpatientDate",outpatientDate);
        String dangerPoints = patInfo.getDangerPoints();
        patInfoMap.put("dangerPoints",dangerPoints);
        String outOrInHos = patInfo.getOutOrInHos();
        patInfoMap.put("outOrInHos",outOrInHos);
        String disease = patInfo.getDisease();
        patInfoMap.put("disease",disease);
        Integer leftEmbolismFlag = patInfo.getLeftEmbolismFlag();
        patInfoMap.put("leftEmbolismFlag",leftEmbolismFlag);
        String leftEmbolism = patInfo.getLeftEmbolism();
        patInfoMap.put("leftEmbolism",leftEmbolism);
        Integer deleteFlag = patInfo.getDeleteFlag();
        patInfoMap.put("deleteFlag",deleteFlag);
        String deletePerson = patInfo.getDeletePerson();
        patInfoMap.put("deletePerson",deletePerson);
        Date deleteTime = patInfo.getDeleteTime();
        patInfoMap.put("deleteTime",deleteTime);

        return patInfoMap;
    }
}