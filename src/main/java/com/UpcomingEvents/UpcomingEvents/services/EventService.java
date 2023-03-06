package com.UpcomingEvents.UpcomingEvents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.UpcomingEvents.UpcomingEvents.models.Event;
import com.UpcomingEvents.UpcomingEvents.payloads.EventPayload;
import com.UpcomingEvents.UpcomingEvents.repositories.EventRepository;


@Service
public class EventService {
private EventRepository repository;

    public EventService(EventRepository repository) {
    this.repository = repository;
}
    public List<Event> getAll() {
        return repository.findAll();
    }
    public Event getOne(Long id) {
        return repository.findById(id).get();
    }
    public void save(Long id, EventPayload event) {
        Event eventToAdd = new Event(id, event.getTitle(), event.getDate(), event.getMax_users(), event.getSigned_users(), event.getDescription(), event.getImage(), event.isAvailable());
        repository.save(eventToAdd);
    }
    public List<Event> delete(Long id) {
        repository.deleteById(id);
        return repository.findAll();
    }
    
}
