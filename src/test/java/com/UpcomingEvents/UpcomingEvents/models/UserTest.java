package com.UpcomingEvents.UpcomingEvents.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UpcomingEvents.UpcomingEvents.controllers.UserController;
import com.UpcomingEvents.UpcomingEvents.payloads.UserPayload;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;




@SpringBootTest
public class UserTest {

    @Autowired
    UserController controller;

// Event miEvent = new Event(1L, "concierto", null, 20, 0, "ojete calor en concierto", "url.jpg", false);
    
@Test
void UserNameIsDiego(){
    UserPayload miUser = new UserPayload(2L, "Diego", "12345", "admin");

    controller.save(miUser);

    String name = controller.getOne(2L).getName();

assertEquals("Diego", name);
}


@Test
void PasswordIsRight(){
    String password = miUser.getPassword();
    assertEquals("12345", password);
} 
@Test
void RolIsAdmin(){
    String rol = miUser.getRol();
    assertEquals("admin", rol);
}
@Test
void UserHaveEvent(){
    List<Event> eventList = new ArrayList<Event>();
    eventList.add(miEvent);
    eventList.add(miEvent);
    miUser.setEvents(eventList);
    List<Event> resultList = miUser.getEvents();
    assertEquals("concierto", resultList.get(0).getTitle());
}

}
