package com.UpcomingEvents.UpcomingEvents.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UpcomingEvents.UpcomingEvents.controllers.UserController;
import com.UpcomingEvents.UpcomingEvents.payloads.UserPayload;



@SpringBootTest
public class UserTest {
    @Autowired
    UserController usercontroller;

    // Event miEvent = new Event(1L, "concierto", null, 20, "ojete calor en concierto", "url.jpg", false);
    
    @Test
    void UserNameIsDiego(){
    UserPayload miUser = new UserPayload(2L, "Diego", "12345", "admin");
    usercontroller.save(miUser);
    String name = usercontroller.getOne(2L).getName();
assertEquals("Diego", name);
}




}
