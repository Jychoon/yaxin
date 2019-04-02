package com.yx.serviceproviderheartfailure.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

public class DiagnameMapper {
    @Id
    private String diagId;
    @Column(name="diagCodePostfixExclude")
    private String diagCodePostfixExclude;
    @Column(name="diagCodePostfixInclude")
    private String diagCodePostfixInclude;
    @Column(name="diagCodePrefix")
    private String diagCodePrefix;
    private String diagCheckboxName;


}
