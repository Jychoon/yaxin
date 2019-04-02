package com.yx.serviceconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WevConfig  implements WebMvcConfigurer {

    /***
     * 跨域支持
     * 时间为四分钟
     */
    @Override
    public void addCorsMappings(CorsRegistry registry){
        System.out.print("222");
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedOrigins("GET","POST","DELETE","PUT")
                .maxAge(4*60);
    }
    /**
     * 请求拦截
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JumpInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/AF/flupAll")
                .excludePathPatterns("/AF/getpatinfo")
                .excludePathPatterns("/AF/operationEntering");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/AF/flupAll")
                .addPathPatterns("/AF/getpatinfo")
                .addPathPatterns("/AF/operationEntering");
    }
}
