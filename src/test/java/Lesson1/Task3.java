package Lesson1;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * *Задание:** Нужно исправить метод сложения двух чисел так, чтобы при переполнении переменной
 * (Запустить пример  System.out.println(sum(2_147_483_647, 2)) ) выбрасывалось предупреждение
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(20, 200));
    }

    public static int sum(int a, int b) {
        if (a + b < 0){
            throw new ArithmeticException();
        } else {
            return a + b;
        }
    }
}
