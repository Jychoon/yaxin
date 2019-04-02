package com.yx.serviceproviderheartfailure.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class leavehospat_list {

    private String orgId;
    @Id
    private String medRecordId;
    private String patId;
    @Column(name = "leaveHos_date")
    private Date leaveHosDate;
    @Column(name = "leaveHos_department")
    private String leaveHosDepartment;
    @Column(name = "inHos_date")
    private Date inHosDate;
    private String totalCost;
    private Date createDate;
    private Date modifyDate;
    private  String deleteIdent;
}
