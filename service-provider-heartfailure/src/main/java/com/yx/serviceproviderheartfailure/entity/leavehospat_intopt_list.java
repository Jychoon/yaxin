package com.yx.serviceproviderheartfailure.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.zip.DataFormatException;

public class leavehospat_intopt_list {


    private String orgId;
    private String patId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;
    private String sequence;
    private String rowNum;
    @Column(name = "intOpt_code")
    private String intOptCode;
    @Column(name = "intOpt_seq")
    private String intOptSeq;
    @Column(name = "intOpt_time")
    private Date intOptTime;
    @Column(name = "intOpt_date")
    private Date intOptDate;
    @Column(name = "createDate")
    private Date createDate;
    private Date modifDate;
    @Column(name = "leaveHos_date")
    private Date leaveHosDate;
    private String docId;
    private Integer versionNum;
    private String  deleteIdent;


}
