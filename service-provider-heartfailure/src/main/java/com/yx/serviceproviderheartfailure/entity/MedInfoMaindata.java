package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MedInfoMaindata {
    @Id
    private String medicineId;
    private String pinyinCode;
    private String drugName;
    private String drugGeneralName;
    @Column(name="basicDrug_ident")
    private String basicDrugIdent;
    @Column(name="injectDrug_ident")
    private String injectDrugIdent;
    @Column(name="poisonDrug_ident")
    private String poisonDrugIdent;
    @Column(name="psychDrug_ident")
    private String psychDrugIdent;
    @Column(name="anesDrug_ident")
    private String anesDrugIdent;
    @Column(name="highAlertDrug_ident")
    private String highAlertDrugIdent;
    @Column(name="antibacDrug_lv")
    private String antibacDrugLv;
}
