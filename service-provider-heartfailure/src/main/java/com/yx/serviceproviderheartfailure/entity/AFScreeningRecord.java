package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class AFScreeningRecord {
    @Id
    private Integer dbSeq;
    private String inHosOutHos;
    private Date gatherDate;
    private String gatherId;
    private String patName;
    private String patSex;
    private Date birthday;
    private String currentsymptom;
    private String rhythm;
    @Column(name="medRecord_id")
    private String medRecordId;
    private String telNumber;
    private Integer sceeningAge;
    private Integer height;
    private Float bodyweight;
    private String wheSmoking;
    private Integer smokingDuration;
    private Integer dailyFreq;
    private String wheQuitSmoking;
    private String wheAlcohol;
    private Integer alcoholDuration;
    private Integer weeklyFreq;
    private Integer alcoholIntakeAmount;
    @Column(name="whe_quitDrink")
    private String wheQuitDrink;
    @Column(name="AF_type")
    private String AFType;
    @Column(name="AF_duration")
    private Integer AFDuration;
    @Column(name="Mitral_Stenosis")
    private String MitralStenosis;
    @Column(name="whe_AF_interv")
    private String wheAFInterv;
    @Column(name="AF_interv_type")
    private String AFIntervType;
    @Column(name="Replacement_value_type")
    private Integer ReplacementValueType;
    private String wheAntic;
    private String anticDrug;
    @Column(name="TOD")
    private String TOD;
    private String wheStroke;
    private String strokeType;
    @Column(name="CHA2CS2_VASc")
    private String CHA2CS2VASc;
    @Column(name="HASBLED")
    private String HASBLED;
    @Column(name="whe_HBP")
    private String wheHBP;
    @Column(name="HBP_lv")
    private Integer HBPLv;
    @Column(name="whe_DM")
    private String wheDM;
    @Column(name="DM_duration")
    private Integer DMDuration;
    @Column(name="DM_treatment")
    private String DMTreatment;
    @Column(name="whe_HCL")
    private String wheHCL;
    @Column(name="whe_HF")
    private String wheHF;
    @Column(name="whe_COPD")
    private String wheCOPD;
    @Column(name="whe_CAD")
    private String wheCAD;
    @Column(name="whe_revasCAD")
    private String wheRevasCAD;
    @Column(name="AMI")
    private String AMI;
    @Column(name="revasCAD_type")
    private String revasCADType;
    @Column(name="whe_VAD")
    private String wheVAD;
    @Column(name="whe_surgVAD")
    private String wheSurgVAD;
    private String wheBleeding;
    private String bleedingSite;
    @Column(name="PVD")
    private String PVD;
    private String wheThyoid;
    private String wheLiver;
    private String wheKidney;
    private String remarks;
    private String modifierId;
    private Date modifierDate;
    private String isDelete;
    private Date deleteDate;

}
