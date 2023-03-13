package com.UpcomingEvents.UpcomingEvents.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.servlet.AuthorizeRequestsDsl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.UpcomingEvents.UpcomingEvents.services.JpaUserDetailsService;

import net.bytebuddy.build.Plugin.Engine.Source.InMemory;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

@Autowired
MyBasicAuthenticationEntryPoint authenticationEntryPoint;

private final JpaUserDetailsService jpaUserDetailsService;


public SecurityConfiguration(JpaUserDetailsService jpaUserDetailsService) {
        this.jpaUserDetailsService = jpaUserDetailsService;
}



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
                        // .antMatchers("/api/events").hasRole("USER")
                        .antMatchers("/api/events/**","/api/register").permitAll()
                        .antMatchers("/api/login").hasAnyRole("ADMIN","USER")
                        .anyRequest().authenticated())
                .userDetailsService(jpaUserDetailsService)
                .sessionManagement( session -> session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)) 
                .headers(header -> header.frameOptions().sameOrigin())
                .httpBasic(basic -> basic.authenticationEntryPoint(authenticationEntryPoint));      
                // .httpBasic(Customizer.withDefaults());
                // http.addFilterAfter(new CustomFilter(), BasicAuthenticationFilter.class);
                return http.build();
    }
                
        @Bean
        public InMemoryUserDetailsManager userDetailsService(){
                PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
                String password = encoder.encode("1234");
                
                UserDetails user = User.withUsername("admin")
                        .password(password)
                        .roles("ADMIN")
                        .build();
                        Collection<UserDetails> users = new ArrayList<>();
                        users.add(user);

                        return new InMemoryUserDetailsManager(users);
        
        
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
