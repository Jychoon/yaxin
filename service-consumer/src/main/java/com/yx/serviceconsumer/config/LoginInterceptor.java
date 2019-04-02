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

public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private RestTemplate restTemplate;
    @Value("serverUrl")
    private String providerHfUrl;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            String loginName=request.getParameter("loginname");
            HttpSession session=request.getSession();
            if(loginName!=null&&!"".equals(loginName)){
                session.setAttribute("uid",loginName);
                String userName=restTemplate.getForObject(providerHfUrl+"/getUserName?loginName="+loginName,String.class);
                if(userName!=null&&!"".equals(userName)){
                    Cookie cookie=new Cookie("Login",loginName+"-"+userName);
                    response.addCookie(cookie);
                    return true;
                }
            }
            return true;
    }
}
