package com.yx.serviceproviderheartfailure.controller;
import com.yx.serviceproviderheartfailure.service.PatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PatInfoController {
    @Autowired
    private PatInfoService PatInfoService;

    @GetMapping("/getPatInfo")
    public HashMap getPatInfo(){//@RequestBody String orgId, String medRecordId){
        String orgId = "1";
        String medRecordId = "2";
        return PatInfoService.getPatInfo(orgId, medRecordId);
    }
}
