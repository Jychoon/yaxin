package com.yx.serviceproviderheartfailure.controller;


import com.netflix.discovery.converters.Auto;
import com.yx.serviceproviderheartfailure.entity.SysUserInfo;
import com.yx.serviceproviderheartfailure.service.SysUserInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Autowired
    private SysUserInfoService sysUserInfoService;
    @GetMapping("/login")
    public Boolean loginIn(@RequestParam("username") String username,@RequestParam("password")String password){
        return sysUserInfoService.login(username,password);
    }
}
