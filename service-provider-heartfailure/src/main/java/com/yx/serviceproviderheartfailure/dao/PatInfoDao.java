package com.yx.serviceproviderheartfailure.dao;

import com.yx.serviceproviderheartfailure.entity.PatInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatInfoDao extends JpaRepository<PatInfo,String> {

    PatInfo findByOrgIdAndMedRecordId(String orgId, String medRecordId);
}