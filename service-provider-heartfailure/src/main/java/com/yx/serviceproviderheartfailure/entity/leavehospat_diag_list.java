package com.yx.serviceproviderheartfailure.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class leavehospat_diag_list {

    private String orgId;
    private String patId;
    @Id
    @Column(name = "medRecord_id")
    private String medRecordId;
    private String sequence;
    private String rowNum;
    @Column(name = "mainDiag_ident")
    private String mainDiagIdent;
    private String diagCode;
    private String diagText;
    private Date leaveHosDate;
    private Date createDate;
    private  Date modifyDate;

    private String docId;

    private Integer versionNum;
    private String deleteIdent;


}
