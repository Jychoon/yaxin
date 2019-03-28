package com.yx.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@CrossOrigin
@RestController
public class PatInfoController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getPatInfo")
    public HashMap getPatInfo(){
        return restTemplate.getForObject("http://service-provider-heartfailure/getPatInfo",HashMap.class);
    }
}
