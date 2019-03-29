package com.yx.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class PatInfoController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getPatInfo")
    public HashMap getPatInfo(@RequestParam("orgId")String orgId,@RequestParam("medRecordId")String medRecordId){
        return restTemplate.getForObject("http://service-provider-heartfailure/getPatInfo?orgId=" + orgId + "&medRecordId=" +medRecordId,HashMap.class);
    }
    @GetMapping("/getPatInfoTest")
    public HashMap getPatInfoTest(){
        return restTemplate.getForObject("http://service-provider-heartfailure/getPatInfoTest",HashMap.class);
    }
}
