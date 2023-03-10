package com.UpcomingEvents.UpcomingEvents.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    public void save(Long id, UserPayload user) {
        User userToAdd = new User(id, user.getName(), user.getPassword(), user.getRol(), null);
        repository.save(userToAdd);
    }

    public List<User> delete(Long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    public User store(User user) {


       Optional<User> userFinded = repository.findByName(user.getName());
        if(userFinded == null){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return repository.save(user);
    }

    return null;

    }


}

