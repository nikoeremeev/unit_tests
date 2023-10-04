package org.example.seminar4;

import org.example.seminar4.weather.WeatherReporter;
import org.example.seminar4.weather.WeatherService;



public class Main {


    //**
    // 4.3. Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
    // обращающийся к внешнему API для получения информации о текущей температуре.
    // Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
    // Создайте мок-объект для WeatherService с использованием Mockito.
    // *

    public static void main(String[] args) {
        // Создаем объект WeatherService. В реальной программе, этот класс
        // бы обращался к внешнему API для получения температуры.
        WeatherService weatherService = new WeatherService();

        // Создаем объект WeatherReporter, передаем ему WeatherService в конструктор.
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        // Получаем отчет о погоде.
        String report = weatherReporter.generateReport();

        // Выводим отчет на консоль.
        System.out.println(report);

    }





}