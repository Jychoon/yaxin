package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class PatInfoPrimaryKey implements Serializable {

    @Column(name = "org_id")
    private String orgId;
    @Column(name = "medRecord_id")
    private String medRecordId;
}
