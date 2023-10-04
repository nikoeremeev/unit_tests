package org.example.homework3.task2;

import org.example.Homework2.Car;
import org.example.Homework2.Motorcycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    private List<User> data;

    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
       data = new ArrayList<>();
       data.add(new User("Bob1","123456", true));
       data.add(new User("Bob2","123456", false));
       data.add(new User("Bob3","123456", true));
       data.add(new User("Bob4","123456", false));
       userRepository = new UserRepository();
       userRepository.setData(data);
    }

    @Test
    void logsOutUserExceptAdmins() {
        userRepository.logsOutUserExceptAdmins();
        assertThat(data).hasSize(2);

    }
}