package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class PatInfoPrimaryKey implements Serializable {

    private String orgId;
    private String medRecordId;
}
