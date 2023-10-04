package org.example.homework6;

import java.util.List;

public class Task {
    /**
     * метод поиска наибольшего из средних значений
     * @param listOne - первый список для поиска
     * @param listTwo - второй список для поиска
     * @return - результат поиска
     */
    public static String findMaxAvg(List<Integer> listOne, List<Integer> listTwo ){
        if (listOne.isEmpty() || listTwo.isEmpty()){
            throw new IllegalArgumentException();
        }
        double resultOne = searchAverage(listOne);
        double resultTwo = searchAverage(listTwo);

        if (resultOne > resultTwo){
            return "Первый список имеет большее среднее значение";
        } else if (resultTwo > resultOne){
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    /**
     * поиск среднего арифметического
     * @param list - список в котором будет поиск
     * @return - результат нахождения
     */
    public static double searchAverage(List<Integer> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum / list.size();
    }
}
