package org.example.seminar5.task1;

import org.example.seminar5.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberGeneratorTest {
    @Test
    public void testGenerateNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<Integer> numbers = generator.generateNumbers(10);

        assertNotNull(numbers);
        assertEquals(10, numbers.size());
    }
}