package com.UpcomingEvents.UpcomingEvents.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
public class UserTest {
    User miUser = new User(1L, "Diego", "12345", "admin", null);
Event miEvent = new Event(1L, "concierto", null, 20, "ojete calor en concierto", "url.jpg", false);
    @Test
void UserNameIsDiego(){
String name = miUser.getName();
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
