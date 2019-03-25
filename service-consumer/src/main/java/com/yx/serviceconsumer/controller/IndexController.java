package com.yx.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class IndexController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/login")
    public Boolean index(){
        return restTemplate.getForObject("http://service-provider-heartfailure/login",Boolean.class);
    }
}
