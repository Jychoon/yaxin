package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "patexamres_record")
@Data
public class PatExamResRecord {

    private String orgId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;
    private String docId;
    private String versionNum;
    private String docPart;
    private String rowNum;
    private String patId;
    private String docType;
    private String serviceCode;
    private String dirServiceText;
    @Column(name = "exam_Value")
    private String examValue;
    @Column(name = "exam_Unit")
    private String examUnit;
    private Date examDate;
    private Date examTime;


}
