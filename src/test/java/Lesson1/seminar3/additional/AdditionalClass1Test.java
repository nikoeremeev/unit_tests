package Lesson1.seminar3.additional;

import org.example.Homework2.Car;
import org.example.Homework2.Motorcycle;
import org.example.seminar3.additional.AdditionalClass1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalClass1Test {

    private AdditionalClass1 additionalClass1;

    @BeforeEach
    public void setUp() {
        additionalClass1 = new AdditionalClass1();
    }

    @Test
    void customOperation() {
        assertEquals(6, additionalClass1.customOperation(3,3) );
    }
}