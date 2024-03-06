package com.grigoryev.soap.service.impl;

import com.grigoryev.soap.service.CalculatorService;
import jakarta.jws.WebService;

@WebService
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}
