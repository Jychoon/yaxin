package com.yx.serviceproviderheartfailure.dao;

import com.yx.serviceproviderheartfailure.entity.SysUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserInfoDao extends JpaRepository<SysUserInfo,String> {

    SysUserInfo findByLoginNameAndPassword(String loginName,String password);
}
