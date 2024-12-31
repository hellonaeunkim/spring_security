package com.springsecurity.configures;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                      .requestMatchers("/me").hasAnyRole("USER", "ADMIN")
                      .anyRequest().permitAll()
                )
                .formLogin((form) -> form
                     .defaultSuccessUrl("/")
                     .permitAll()
                );
        return http.build();
    }
}