package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
class PatInfoKey implements Serializable{
    private String orgId;
    private String medRecordId;
}

@Entity
@IdClass(PatInfoKey.class)
@Table(name = "pat_info")
@Data
public class PatInfo implements Serializable{
    @Id
    private String orgId;
    @Id
    private String medRecordId;
    @Column(name = "pat_id")
    private String patId;
    private String name;
    private String sex;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "insur_type")
    private String insurType;
    @Column(name = "insur_provider")
    private String insurProvider;
    @Column(name = "IDCard_num")
    private String IDCardNum;
    @Column(name = "first_visit_time")
    private Date firstVisitTime;
    @Column(name = "inHos_time")
    private Date inHosTime;
    private String symptom;
    @Column(name = "pat_from")
    private String patFrom;
    @Column(name = "valvular_ablation")
    private String valvularAblation;
    @Column(name = "atrialFib_type")
    private String atrialFibType;
    @Column(name = "other_malady")
    private String otherMalady;
    @Column(name = "ScR")
    private Integer ScR;
    @Column(name = "SUM")
    private Float SUM;
    @Column(name = "GFR")
    private Integer GFR;
    @Column(name = "CHA2DS2_VASc")
    private Integer CHA2DS2VASc;
    @Column(name = "HAS_BLED")
    private Integer HASBLED;
    @Column(name = "whe_IVSDCC")
    private Integer wheIVSDCC;
    @Column(name = "past_antiarrhythmic")
    private String pastAntiarrhythmic;
    @Column(name = "now_antiarrhythmic")
    private String nowAntiarrhythmic;
    @Column(name = "past_antithrombotic")
    private String pastAntithrombotic;
    @Column(name = "now_antithrombotic")
    private String nowAntithrombotic;
    @Column(name = "whe_INR_monitor")
    private Integer wheINRMonitor;
    @Column(name = "past_whe_INR_standard")
    private Integer pastWheINRStandard;
    @Column(name = "opt_in_hos")
    private String optInHos;
    @Column(name = "whe_INR_standard")
    private Integer wheINRStandard;
    @Column(name = "rhythm_leave_hos")
    private String rhythmLeaveHos;
    @Column(name = "ACE_medication")
    private String ACEMedication;
    @Column(name = "statins_medication")
    private String statinsMedication;
    @Column(name = "total_days_in_hos")
    private Integer totalDaysInHos;
    @Column(name = "hospitalization_expenses")
    private Float hospitalizationExpenses;
    @Column(name = "last_mod_time")
    private Date lastModTime;//datetime
    @Column(name = "last_mod_person")
    private String lastModPerson;
    @Column(name = "embolism_flag")
    private Integer embolismFlag;
    @Column(name = "hemorrhage_flag")
    private Integer hemorrhageFlag;
    @Column(name = "haemorrhage_in_hos_flag")
    private Integer haemorrhageInHosFlag;
    @Column(name = "currentPercent")
    private Integer currentPercent;
    @Column(name = "outpatient_date")
    private Date outpatientDate;
    @Column(name = "danger_points")
    private String dangerPoints;
    @Column(name = "outOrInHos")
    private String outOrInHos;
    private String disease;
    @Column(name = "left_embolism_flag")
    private Integer leftEmbolismFlag;
    @Column(name = "left_embolism")
    private String leftEmbolism;
    @Column(name = "delete_flag")
    private Integer deleteFlag;
    @Column(name = "delete_person")
    private String deletePerson;
    @Column(name = "delete_time")
    private Date deleteTime;//datetime
}

/*@Embeddable
class PatInfoPrimaryid implements Serializable {

    private String orgId;
    private String medRecordId;
}*/
