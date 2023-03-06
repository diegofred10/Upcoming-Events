package com.UpcomingEvents.UpcomingEvents.services;

import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.Event;
import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.payloads.SubscribePayload;
import com.UpcomingEvents.UpcomingEvents.repositories.EventRepository;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@Service
public class SubscribeService {
    private UserRepository userRepository;
    private EventRepository eventRepository;

    

    public SubscribeService(UserRepository userRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public void signIn(SubscribePayload subscribe) {
        User user = userRepository.findById(subscribe.getId_user()).get();
        Event event = eventRepository.findById(subscribe.getId_event()).get();
        if (event != null && !user.getEvents().contains(event) && event.isAvailable() && event.getSigned_users()<event.getMax_users()) {
            event.setSigned_users(event.getSigned_users()+1);
            user.getEvents().add(event);
        }
        if (event == null) {
            //message: event not found
        }
        if (user.getEvents().contains(event)) {
            //message: already signed
        }
        if (event.isAvailable() == false) {
            //message: event not available
        }
        userRepository.save(user);
    }
    
}
