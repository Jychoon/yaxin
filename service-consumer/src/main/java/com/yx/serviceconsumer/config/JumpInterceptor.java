package com.yx.serviceconsumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;

public class JumpInterceptor implements HandlerInterceptor {
    @Autowired
    RestTemplate restTemplate;
    @Value("serverUrl")
    String providerHfUrl;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.print("333");
        HttpSession session=request.getSession();
        Cookie[] cookies=request.getCookies();
        String uid= (String) session.getAttribute("uid");
        Boolean isLoginCookieNull=true;
        Cookie cookie=null;
        for(Cookie c:cookies){
            if("Login".equals(c.getName())){
                isLoginCookieNull=false;
                cookie=c;
            }
        }
        if(isLoginCookieNull){   //无登陆信息缓存
            return false;
        }
        if(uid==null){  //会话不存在
            String[] loginInfo=cookie.getValue().split("-");
            if(loginInfo!=null&&loginInfo.length==2){
                String loginName=loginInfo[0];
                session.setAttribute("uid",loginName);
                return true;
            }
        }
        return true;
    }
}
