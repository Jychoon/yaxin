package com.yx.serviceproviderheartfailure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class SysUserInfo {

    @Id
    private String loginName;
    private Date validateDate;
    private Date invalidateDate;
    private String userName;
    private String password;
    private String staffId;

}
