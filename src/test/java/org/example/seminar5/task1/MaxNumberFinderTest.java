package org.example.seminar5.task1;

import org.example.seminar5.MaxNumberFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MaxNumberFinderTest {
    @Test
    public void testFindMax() {
        MaxNumberFinder finder = new MaxNumberFinder();
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 6, 8);

        int max = finder.findMax(numbers);

        assertEquals(9, max);
    }

    @Test
    public void testFindMaxEmptyList() {
        MaxNumberFinder finder = new MaxNumberFinder();
        List<Integer> emptyList = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> finder.findMax(emptyList));
    }
}