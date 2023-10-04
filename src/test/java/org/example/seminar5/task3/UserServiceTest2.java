package org.example.seminar5.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest2 {

    @Test
    public void testUserServiceIntegration() {
// Создаем заглушку (mock) для UserRepository
        UserRepository userRepository = mock(UserRepository.class);

// Создаем объект UserService, передавая ему заглушку UserRepository
        UserService userService = new UserService(userRepository);

// Задаем ожидаемое поведение заглушки
        int userId = 1;
        when(userRepository.getUserById(userId)).thenReturn("User " + userId);

// Вызываем метод getUserName на объекте UserService
        String userName = userService.getUserName(userId);

// Проверяем, что метод getUserById был вызван с нужным аргументом
        verify(userRepository).getUserById(userId);

// Проверяем, что результат соответствует ожидаемому
        assertEquals("User 1", userName);
    }
}
