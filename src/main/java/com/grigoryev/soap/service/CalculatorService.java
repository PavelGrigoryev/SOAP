package com.grigoryev.soap.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CalculatorService {

    @WebMethod
    int add(int firstNumber, int secondNumber);

    @WebMethod
    int sub(int firstNumber, int secondNumber);

}
