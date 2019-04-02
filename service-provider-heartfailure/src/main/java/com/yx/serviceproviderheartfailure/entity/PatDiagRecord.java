package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patdiag_record")
@Data
public class PatDiagRecord {

    private String orgId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;
    private String seqNum;
    private String diagDir;
    private String diagCode;
    private String patId;
    @Column(name = "diagCreate_date")
    private Date diagCreateDate;
    @Column(name = "recCreate_date")
    private Date recCreateDate;
    @Column(name = "recMod_date")
    private Date recModDate;
    private Date cancelDate;
    private String removeIdent;
}
