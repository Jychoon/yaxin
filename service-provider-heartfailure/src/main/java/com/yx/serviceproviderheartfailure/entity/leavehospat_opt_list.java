package com.yx.serviceproviderheartfailure.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class leavehospat_opt_list {


    private String orgId;
    private String patId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;
    @Id
    private String sequence;
    private String rowNum;
    private String optCode;
    private  String optSeq;
    private Date optDate;
    private Date optTime;
    @Column(name = "createDate")
    private Date createDate;
    private Date modifDate;
    @Column(name = "leaveHos_date")
    private Date leaveHosDate;
    private String docId;
    private Integer versionNum;
    private String  deleteIdent;

}
