import org.junit.jupiter.api.Test;
import seminars.third.hw.EvenOddNumberChecker;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvenOddNumberChecker {

    @Test
    public void testEvenNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(4);
        assertEquals("четное", result);
    }

    @Test
    public void testOddNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(7);
        assertEquals("нечетное", result);
    }

    @Test
    public void testZero() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(0);
        assertEquals("четное", result);
    }

    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(-6);
        assertEquals("четное", result);
    }

    @Test
    public void testNegativeOddNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(-3);
        assertEquals("нечетное", result);
    }
}
