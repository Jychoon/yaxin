package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class DataUpdateDateRecord {
    @Column(name = "leaveHosUpdate_date")
    private Date leaveHosUpdateDate;
    @Column(name = "basicInfoUpdate_date")
    private Date basicInfoUpdateDate;
    @Column(name = "patMPDiagUpdate_date")
    private Date patMPDiagUpdateDate;
    @Column(name = "patMPIntOptUpdate_date")
    private Date patMPIntOptUpdateDate;
    @Column(name = "patMPOptUpdate_date")
    private Date patMPOptUpdateDate;
    @Column(name = "diagInfoUpdate_date")
    private Date diagInfoUpdateDate;
    @Column(name = "medInfoUpdate_date")
    private Date medInfoUpdateDate;
    @Column(name = "examInfoUpdate_date")
    private Date examInfoUpdateDate;
    @Column(name = "staffInfoUpdate_date")
    private Date staffInfoUpdateDate;
    @Column(name = "medMDUpdate_date")
    private Date medMDUpdateDate;
    @Column(name = "optMDUpdate_date")
    private Date optMDUpdateDate;
    @Column(name = "diagMDUpdate_date")
    private Date diagMDUpdateDate;
    @Column(name = "flupSchedRecordUpdate_date")
    private Date flupSchedRecordUpdateDate;
}
