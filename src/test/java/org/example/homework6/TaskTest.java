package org.example.homework6;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
class TaskTest {

    @Test
    void findMaxAvg() {
        List<Integer> listOne = new ArrayList<>(List.of(6,6,6));
        List<Integer> listTwo = new ArrayList<>(List.of(2, 2, 2));

        String expected = "Первый список имеет большее среднее значение";
        String actual = Task.findMaxAvg(listOne, listTwo);
        assertEquals(expected, actual);

        listTwo.add(18);
        expected = "Средние значения равны";
        actual = Task.findMaxAvg(listOne, listTwo);
        assertEquals(expected, actual);

        listTwo.add(18);
        expected = "Второй список имеет большее среднее значение";
        actual = Task.findMaxAvg(listOne, listTwo);
        assertEquals(expected, actual);

    }

    @Test
    public void testIsEmptyListTwo() {
        List<Integer> listOneEmpty = new ArrayList<>();
        List<Integer> listTwoEmpty = new ArrayList<>();

        assertThrows(IllegalArgumentException.class,
                () -> Task.findMaxAvg(listOneEmpty, listTwoEmpty));
    }

    @Test
    void searchAverage() {
        List<Integer> list = new ArrayList<>(List.of(3,6,12));

        double result = Task.searchAverage(list);

        assertEquals(7,result);

    }

    @Test
    public void testEmptyList() {
        List<Integer> input = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            Task.searchAverage(input);
        });
    }
}