package com.UpcomingEvents.UpcomingEvents.payloads;

public class SubscribePayload {

    private Long id_user;
    private Long id_event;

    
    public SubscribePayload() {
    }

    public SubscribePayload(Long id_user, Long id_event) {
        this.id_user = id_user;
        this.id_event = id_event;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_event() {
        return id_event;
    }

    public void setId_event(Long id_event) {
        this.id_event = id_event;
    }
    

    
    
}
