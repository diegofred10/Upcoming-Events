package com.UpcomingEvents.UpcomingEvents.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf(csrf -> csrf.disable())
                .logout(out -> out
                        .logoutUrl("/api/logout")
                        .deleteCookies("JSESSIONID"))
                .authorizeRequests(auth -> auth
                        // .antMatchers("/api/dogs").hasRole("USER")
                        // .antMatchers("/api/cats").hasRole("ADMIN")
                        .anyRequest().authenticated())
                .headers(header -> header.frameOptions().disable())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
