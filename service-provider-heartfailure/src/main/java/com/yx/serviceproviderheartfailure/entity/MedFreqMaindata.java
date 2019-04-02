package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medfreq_maindata")
@Data
public class MedFreqMaindata {
    @Id
    private String circleCode;
    private String circleText;
    private String circleDescription;

}
