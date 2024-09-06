package com.thevarungupta.problemz.config;

import com.thevarungupta.problemz.security.ProblemzAuthenticationProvider;
import com.thevarungupta.problemz.security.ProblemzHttpConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        var authProvider = new ProblemzAuthenticationProvider();
        http.apply(ProblemzHttpConfigurer.newInstance());
        http.authenticationProvider(authProvider);
        http.csrf().disable().authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );
        return http.build();
    }

}
