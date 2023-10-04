package org.example.seminar3.contoller;

import org.example.seminar3.model.CalculatorModel;
import org.example.seminar3.view.CalculatorView;


public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public int calculate(int num1, int num2, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = model.add(num1, num2);
                break;
            case "-":
                result = model.subtract(num1, num2);
                break;
            case "*":
                result = model.multiply(num1, num2);
                break;
            case "/":
                result = model.divide(num1, num2);
                if (result < 0) {
                    throw new CalculatorModel.NegativeNumberException("Результат отрицателен");
                }
                break;
            case "^":
                throw new CalculatorModel.InvalidOperatorException("Оператор '^' не поддерживается");
            case "":
                throw new CalculatorModel.InvalidOperatorException("Оператор не указан");
            default:
                throw new CalculatorModel.InvalidOperatorException("Недопустимый оператор: " + operator);
        }
        view.printResult(result);
        return result;
    }
}
