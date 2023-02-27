package com.UpcomingEvents.UpcomingEvents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.payloads.UserPayload;
import com.UpcomingEvents.UpcomingEvents.services.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private UserService service;


    public UserController(UserService service) {
        this.service = service;
    }
    
    @GetMapping(path = "")
    public List<User> getAll() {
        return service.getAll();
    }
    @GetMapping(path = "/{id}")
    public User getOne(@PathVariable Long id) {
        return service.getOne(id);
    }
    @PostMapping(path = "")
    public void save(@RequestBody UserPayload user){
        service.save(user);
    }
}
