package com.yx.serviceproviderheartfailure.service;

import com.yx.serviceproviderheartfailure.dao.SysUserInfoDao;
import com.yx.serviceproviderheartfailure.entity.SysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SysUserInfoService {
    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    public Boolean login(String loginName,String password){
        try{
            SysUserInfo sysUserInfo =sysUserInfoDao.findByLoginNameAndPassword(loginName,password);
            if(sysUserInfo!=null){
                String password1=new BCryptPasswordEncoder().encode(sysUserInfo.getPassword());
                String loginName1=sysUserInfo.getLoginName();
                if(loginName.equals(loginName1)&&password.equals(password1)){
                    return true;
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }
}
