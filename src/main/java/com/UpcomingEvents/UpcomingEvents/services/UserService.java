package com.UpcomingEvents.UpcomingEvents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.payloads.UserPayload;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository repository;
    

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getOne(Long id) {
        return repository.findById(id).get();
    }

    public void save(UserPayload user) {
        User userToAdd = new User(null, user.getName(), user.getPassword(), user.getRol(), null);
        repository.save(userToAdd);
    }

    public List<User> delete(Long id) {
        repository.deleteById(id);
        return repository.findAll();
    }
    
    
}
