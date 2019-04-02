package com.yx.serviceproviderheartfailure.entity;

import com.netflix.discovery.EurekaNamespace;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class DiagInfoMaindata {
    @Id
    private String diagCode;
    private String diagText;
    private String dirIdent;
}