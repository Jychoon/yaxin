package com.yx.serviceproviderheartfailure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/login")
    public Boolean loginIn(){
        return true;
    }
}
