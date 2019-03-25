package com.yx.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://service-provider-heartfailure/index",String.class);
    }
}
