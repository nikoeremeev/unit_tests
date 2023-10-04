package third.seminar.hw;

import java.util.Scanner;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int numberToCheck = scanner.nextInt();

        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        String result = checker.evenOddNumber(numberToCheck);

        System.out.println(numberToCheck + result + " числом.");

        scanner.close();
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

}
