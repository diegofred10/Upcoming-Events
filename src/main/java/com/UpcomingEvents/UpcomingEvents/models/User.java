package com.UpcomingEvents.UpcomingEvents.models;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;
    private String userName;
    private String password;
    private String role;

    @ManyToMany
    private List<Event> events;

    public User() {
    }

    public User(Long id, String userName, String password, String role, List<Event> events) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.events = events;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
