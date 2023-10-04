package org.example.seminar3.model;

public class CalculatorModel {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }

    // DivisionByZeroException.java

    public static class DivisionByZeroException extends RuntimeException {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

// InvalidOperatorException.java

    public static class InvalidOperatorException extends RuntimeException {
        public InvalidOperatorException(String message) {
            super(message);
        }
    }

// NegativeNumberException.java
    public static class NegativeNumberException extends RuntimeException {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
}
