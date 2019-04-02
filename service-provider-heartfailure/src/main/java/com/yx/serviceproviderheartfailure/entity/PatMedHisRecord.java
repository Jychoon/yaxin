package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "patmedhis_record")
@Data
public class PatMedHisRecord {
    private String orgId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;

    private String patId;
    @Column(name = "docAdvice_id")
    private String docAdviceId;
    private String eventId;

    private String version;
    @Id
    @Column(name = "docAdviceType_id")
    private String docAdviceTypeId;
    @Id
    @Column(name = "drug_id")
    private String drugId;
    private Date drugStartDate;
    private String drugStartTime;
    private String drugName;
    private Date validateDate;
    private String validateTime;
    private Date invalidateDate;
    private String invalidateTime;
    private String validateDuration;
    private String durationUnit;
    private String circleCode;
    private Float dosagePlan;
    private Float dosageActual;
    private String dosageUnit;
    private String cancelIdent;
    private Date cancelDate;
}
