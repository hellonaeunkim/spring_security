package com.springsecurity.configures;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration : 이 클래스가 Spring 설정 클래스임을 나타낸다.
@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {

    // Controller없이 URL 요청을 특정 View와 매핑
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // "/" 경로로 요청이 들어오면 "index" 뷰 파일을 반환
        // ex. 브라우저에서 "http://localhost:8080/"을 요청하면 index.html 파일이 렌더링된다.
        registry.addViewController("/").setViewName("index");
        // ex. 브라우저에서 "http://localhost:8080/me"을 요청하면 me.html 파일이 렌더링된다.
        registry.addViewController("/me").setViewName("me");
    }
}
