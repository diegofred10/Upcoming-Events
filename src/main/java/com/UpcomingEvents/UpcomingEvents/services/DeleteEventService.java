package com.UpcomingEvents.UpcomingEvents.services;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.Event;
import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.repositories.EventRepository;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@Service
public class DeleteEventService {
    private UserRepository userRepository;
    private EventRepository eventRepository;

    
    public DeleteEventService(UserRepository userRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }


    public void deleteEvent(Long id) {
        List<User> usersList = userRepository.findAll();
        for (User user : usersList) {
            List<Event> eventsList = new ArrayList<>(user.getEvents());
            for (Event event : eventsList) {
                if (event.getId()==id) {
                    // eventsList = ArrayUtils.removeElement(eventsList, event);
                    user.setEvents(eventsList);
                }
            }
        }
        eventRepository.deleteById(id);
    }
    
}
