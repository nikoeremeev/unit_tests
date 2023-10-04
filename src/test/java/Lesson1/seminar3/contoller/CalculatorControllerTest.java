package Lesson1.seminar3.contoller;

import org.example.Homework2.Car;
import org.example.Homework2.Motorcycle;
import org.example.seminar3.contoller.CalculatorController;
import org.example.seminar3.model.CalculatorModel;
import org.example.seminar3.view.CalculatorView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    private CalculatorController calculatorController;

    private CalculatorModel model;
    private CalculatorView view;

    @BeforeEach
    public void setUp() {
        model = new CalculatorModel();
        view = new CalculatorView();
        calculatorController  = new CalculatorController(model,view);
    }

    @Test
    void calculate() {
        int result = calculatorController.calculate(5,5,"+");
        assertEquals(10, result);
        result = calculatorController.calculate(10,5,"-");
        assertEquals(5,result);
        double result1 = calculatorController.calculate(50,5,"*");
        assertEquals(250,result1);
        result1 = calculatorController.calculate(5,5,"/");
        assertEquals(1,result1);

        assertThrows(CalculatorModel.InvalidOperatorException.class, () -> {
            calculatorController.calculate(10, 5, "^");
        });

        assertThrows(CalculatorModel.InvalidOperatorException.class, () -> {
            calculatorController.calculate(10, 5, " ");
        });

        assertThrows(CalculatorModel.NegativeNumberException.class, () -> {
            calculatorController.calculate(5, -1, "/");
        });

    }
}