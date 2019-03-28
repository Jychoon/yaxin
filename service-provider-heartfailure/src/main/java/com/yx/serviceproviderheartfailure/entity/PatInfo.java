package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
//@IdClass(PatInfoPrimaryKey.class)
@Data
public class PatInfo{
    @EmbeddedId
    private String orgId;
    @EmbeddedId
    @Column(name = "medRecord_id")
    private String medRecordId;
    private String patId;
    private String name;
    private String sex;
    private Date birthDate;
    private String phoneNumber;
    private String insurType;
    private String insurProvider;
    private String IDCardNum;
    private Date firstVisitTime;
    private Date inHosTime;
    private String symptom;
    private String patFrom;
    private String valvularAblation;
    private String atrialFibType;
    private String otherMalady;
    private int ScR;
    private float SUM;
    private int GFR;
    private int CHA2DS2VASc;
    private int HASBLED;
    private int wheIVSDCC;
    private String pastAntiarrhythmic;
    private String nowAntiarrhythmic;
    private String pastAntithrombotic;
    private String nowAntithrombotic;
    private int wheINRMonitor;
    private int pastWheINRStandard;
    private String optInHos;
    private int wheINRStandard;
    private String rhythmLeaveHos;
    private String ACEMedication;
    private String statinsMedication;
    private int totalDaysInHos;
    private float hospitalizationExpenses;
    private Date lastModTime;//datetime
    private String lastModPerson;
    private int embolismFlag;
    private int hemorrhageFlag;
    private int haemorrhageInHosFlag;
    private int currentPercent;
    private Date outpatientDate;
    private String dangerPoints;
    private String outOrInHos;
    private String disease;
    private int leftEmbolismFlag;
    private String leftEmbolism;
    private int deleteFlag;
    private String deletePerson;
    private Date deleteTime;//datetime
}
@Embeddable
class PatInfoPrimaryid implements Serializable {

    private String orgId;
    private String medRecordId;
}