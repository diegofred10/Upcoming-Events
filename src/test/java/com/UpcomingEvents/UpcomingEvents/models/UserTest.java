package com.UpcomingEvents.UpcomingEvents.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UpcomingEvents.UpcomingEvents.controllers.EventController;
import com.UpcomingEvents.UpcomingEvents.controllers.UserController;
import com.UpcomingEvents.UpcomingEvents.payloads.EventPayload;
import com.UpcomingEvents.UpcomingEvents.payloads.UserPayload;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;




@SpringBootTest
public class UserTest {

    @Autowired
    UserController controller;

    @Autowired
    EventController econtroller;

// Event miEvent = new Event(1L, "concierto", null, 20, 0, "ojete calor en concierto", "url.jpg", false);
    
@Test
void UserNameIsDiego(){
    UserPayload miUser = new UserPayload(2L, "Diego", "12345", "admin");

    controller.save(miUser);

    String name = controller.getOne(2L).getName();

assertEquals("Diego", name);
}

@Test
void NumberOfUsers (){
    UserPayload miUser = new UserPayload(2L, "Diego", "12345", "admin");
    controller.save(miUser);
    int usersNumber = controller.getAll().size();
    assertEquals(2, usersNumber);
}

@Test
void Eventitle (){
     EventPayload miEvent = new EventPayload(null, "concierto online", null, 20, 0, "ojete calor en concierto", "url.jpg", false);
econtroller.save(miEvent);
String title = econtroller.getOne(2L).getTitle();
assertEquals("concierto online", title);


}}
