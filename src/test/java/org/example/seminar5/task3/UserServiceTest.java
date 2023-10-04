package org.example.seminar5.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserRepository mockRepository;

    UserService userService;

    @BeforeEach
    void setUp(){
        mockRepository = Mockito.spy(UserRepository.class);
        userService = new UserService(mockRepository);
    }

    @Test
    void getUserName() {
        userService.getUserName(1);
        Mockito.verify(mockRepository,Mockito.times(1)).getUserById(1);
    }
}