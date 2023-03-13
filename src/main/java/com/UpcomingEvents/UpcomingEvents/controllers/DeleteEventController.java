package com.UpcomingEvents.UpcomingEvents.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.services.DeleteEventService;

@RestController
@RequestMapping(path = "api/events")
public class DeleteEventController {
    private DeleteEventService service;

    public DeleteEventController(DeleteEventService service) {
        this.service = service;
    }

    public DeleteEventService getService() {
        return service;
    }

    public void setService(DeleteEventService service) {
        this.service = service;
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteEvent(@PathVariable Long id){
        service.deleteEvent(id);
    }
}
