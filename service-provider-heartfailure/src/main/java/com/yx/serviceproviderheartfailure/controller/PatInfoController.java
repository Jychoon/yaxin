package com.yx.serviceproviderheartfailure.controller;
import com.yx.serviceproviderheartfailure.service.PatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PatInfoController {
    @Autowired
    private PatInfoService PatInfoService;

    @GetMapping("/getPatInfoTest")
    public HashMap getPatInfoTest(){//@RequestBody String orgId, String medRecordId){
        String orgId = "1";
        String medRecordId = "2";
        return PatInfoService.getPatInfo(orgId, medRecordId);
    }
    @GetMapping("/getPatInfo")
    public HashMap getPatInfo(@RequestParam("orgId")String orgId, @RequestParam("medRecordId")String medRecordId){
        if (orgId != null && medRecordId != null) {
            System.out.print(orgId+" "+medRecordId);
            return PatInfoService.getPatInfo(orgId, medRecordId);
        }
        HashMap<String,String> error = new HashMap<>();
        error.put("ERROR","The parameter is empty or incomplete");
        return error;
    }
}
