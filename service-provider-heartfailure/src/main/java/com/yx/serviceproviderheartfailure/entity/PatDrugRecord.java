package com.yx.serviceproviderheartfailure.entity;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pat_drug_record")
@Data
public class PatDrugRecord {
    @Id
    private String drugRecordId;
    private String orgId;
    private String medRecordId;
    private String drugId;
    private String drugName;
    private Float drugDosage;
    private String dosagUnit;
    private String circleCode;
    private Date startTime;
    private Float drugDuration;
    private String durationUnit;
    private String createPerson;
    private Date createTime;
    private String modifyPerson;
    private Date modifyTime;
    private String hfTag;
    private String ascTag;
    private String afTag;

}
