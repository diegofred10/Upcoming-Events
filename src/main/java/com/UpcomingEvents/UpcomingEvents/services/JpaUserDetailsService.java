package com.UpcomingEvents.UpcomingEvents.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.SecurityUser;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService{

    private UserRepository repository;

    public JpaUserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository 
            .findByUserName(username)
            .map(SecurityUser::new)
            .orElseThrow(()-> new UsernameNotFoundException("User not found:" + username));
    }

   

}
