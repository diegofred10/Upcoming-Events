package com.UpcomingEvents.UpcomingEvents.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.models.Event;
import com.UpcomingEvents.UpcomingEvents.payloads.EventPayload;
import com.UpcomingEvents.UpcomingEvents.services.EventService;



@RestController
@RequestMapping(path = "/api/events")
public class EventController {
    private EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Event> getAll() {
        return service.getAll();
        
    }

    @GetMapping(path = "/{id}")
    public Event getOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping(path = "")
    public void save(@RequestBody EventPayload event){
        service.save(null, event);
    }
    
    // @DeleteMapping(path = "/{id}")
    // public List<Event> delete(@PathVariable Long id){
    //     return service.delete(id);
    // }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Event> update(@PathVariable Long id, @RequestBody EventPayload event){
        try {
            if (service.getOne(id) != null) {
                service.save(id, event);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);               
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    } 
}

