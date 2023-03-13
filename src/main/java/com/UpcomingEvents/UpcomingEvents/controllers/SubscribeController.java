package com.UpcomingEvents.UpcomingEvents.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.payloads.SubscribePayload;
import com.UpcomingEvents.UpcomingEvents.services.SubscribeService;

@RestController
@RequestMapping(path = "/api/subscribe")
public class SubscribeController {
    private SubscribeService service;

    public SubscribeController(SubscribeService service) {
        this.service = service;
    }

    public SubscribeService getService() {
        return service;
    }

    public void setService(SubscribeService service) {
        this.service = service;
    }

    @PutMapping(path="")
    public void signIn (@RequestBody SubscribePayload subscribe){
        service.signIn(subscribe);
    }
    @PutMapping(path="/{id_event}/{id_user}")
    public void signOut (@PathVariable Long id_event, @PathVariable Long id_user){
        service.signOut(id_event, id_user);
    }
}
