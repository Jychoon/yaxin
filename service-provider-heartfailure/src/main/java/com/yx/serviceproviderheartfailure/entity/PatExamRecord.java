package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pat_exam_record")
@Data
public class PatExamRecord {
    @Id
    private String examRecordId;
    private String orgId;
    private String medRecordId;
    private String serviceCode;
    private String drugName;
    private String examValue;
    private String examUnit;
    private Date examTime;
    private String createPerson;
    private Date createTime;
    private String modifyPerson;
    private Date modifyTime;
    private String hfTag;
    private String ascTag;
    private String afTag;
}
