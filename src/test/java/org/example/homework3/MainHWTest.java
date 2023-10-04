package org.example.homework3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumber() {
        assertTrue(MainHW.evenOddNumber(2));
        assertFalse(MainHW.evenOddNumber(3));
    }

    @Test
    void numberInInterval() {
        assertTrue(MainHW.numberInInterval(26));
        assertFalse(MainHW.numberInInterval(111));
    }
}