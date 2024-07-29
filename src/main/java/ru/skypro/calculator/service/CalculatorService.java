package ru.skypro.calculator.service;

import org.springframework.stereotype.Service;
import ru.skypro.calculator.exceptions.DivizionByZeroException;

@Service
public class CalculatorService {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) throws Exception  {
        if (num2 == 0) {
            throw new DivizionByZeroException();
        }

        return num1 / num2;


    }
}
