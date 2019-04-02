package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

public class CheckMainData {

    @Id
    private String checkCode;
    private String checkText;

}
