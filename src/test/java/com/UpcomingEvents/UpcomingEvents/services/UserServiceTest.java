package com.UpcomingEvents.UpcomingEvents.services;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.repositories.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
@InjectMocks
UserService service;

@Mock
UserRepository repository;

    @Test
    void testDelete() {
        
    }

    @Test
    void testGetAll() {
        
    }

    @Test
    void testGetOne() {
        User user = new User(2L, "Diego", "123456", "User",null);
        User user2 = new User(1L, "Diego", "123456", "User",null);

        when(repository.findById(2L)).thenReturn(Optional.of(user));
        User findedUser = service.getOne(2L);

       assertEquals(user2.getId(), findedUser.getId());
    
    }

    

   

    @Test
    void testSave() {
        
    }
}
