package com.UpcomingEvents.UpcomingEvents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.repositories.EventRepository;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@Service
public class DeleteEventService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EventRepository eventRepository;
    
    @Autowired
    private SubscribeService subscribeService;

    public void deleteEvent(Long id_event) {

        List<User> usersList = userRepository.findAll();

        for (User user : usersList) {
            subscribeService.signOut(id_event, user.getId());
        }

        eventRepository.deleteById(id_event);     
    }
}
