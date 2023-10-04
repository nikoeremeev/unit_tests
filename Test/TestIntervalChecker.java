import org.junit.jupiter.api.Test;

import seminars.third.hw.IntervalChecker;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestIntervalChecker {

    @Test
    public void testNumberInInterval() {
        IntervalChecker checker = new IntervalChecker();

        // Проверка чисел, находящихся в интервале
        assertTrue(checker.numberInInterval(26));
        assertTrue(checker.numberInInterval(50));
        assertTrue(checker.numberInInterval(99));

        // Проверка чисел, находящихся вне интервала
        assertFalse(checker.numberInInterval(24));
        assertFalse(checker.numberInInterval(100));
        assertFalse(checker.numberInInterval(0));
        assertFalse(checker.numberInInterval(200));
    }
}
