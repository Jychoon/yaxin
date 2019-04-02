package com.yx.serviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/login")
    public Boolean login(@RequestParam String loginName,@RequestParam String password){
        System.out.print("123");
        return null;//restTemplate.postForObject("http://service-provider-heartfailure/login",Boolean.class);
    }

}
