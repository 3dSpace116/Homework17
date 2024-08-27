package ru.skypro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skypro.calculator.exceptions.DivizionByZeroException;
import ru.skypro.calculator.service.CalculatorService;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Проверка сложения отрицательных чисел")
    void plusNegative() {
        int actual = calculatorService.plus(-3, -7);
        Assertions.assertEquals(-10, actual);

    }

    @Test
    @DisplayName("Проверка сложения положительных чисел")
    void plusPozitive() {
        int actual = calculatorService.plus(3, 7);
        Assertions.assertEquals(10, actual);

    }


    @Test
    @DisplayName("Проверка вычитания отрицательных чисел")
    void minusNegative() {
        int actual = calculatorService.minus(-3, -7);
        Assertions.assertEquals(4, actual);

    }

    @Test
    @DisplayName("Проверка вычитания положительных чисел")
    void minusPozitive() {
        int actual = calculatorService.minus(7, 3);
        Assertions.assertEquals(4, actual);

    }

    @Test
    @DisplayName("Проверка умножения отрицательных чисел")
    void multiplyNegative() {
        int actual = calculatorService.multiply(-3, 7);
        Assertions.assertEquals(-21, actual);

    }

    @Test
    @DisplayName("Проверка умножения положительных чисел")
    void multiplyPozitive() {
        int actual = calculatorService.multiply(3, 7);
        Assertions.assertEquals(21, actual);

    }
    @Test
    @DisplayName("Проверка деления отрицательных чисел")
    void divideNegative()throws Exception {
        int actual = calculatorService.divide(10, -2);
        Assertions.assertEquals(-5, actual);

    }

    @Test
    @DisplayName("Проверка деления положительных чисел")
    void dividePozitive() throws Exception {
        int actual = calculatorService.divide(10, 2);
        Assertions.assertEquals(5, actual);

    }
    @Test
    @DisplayName("Проверка выброса исключения при делении на 0")
    void divizionByZeroThrowsException(){
        Assertions.assertThrows(DivizionByZeroException.class, ()->{calculatorService.divide(10,0);});
    }



}
