package com.ayaz.junit.impl;

import com.ayaz.junit.CalculatorRepository;
import com.ayaz.junit.CalculatorService;
import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    private CalculatorRepository calculatorRepository;

    public CalculatorServiceImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public int add(int a, int b) {
        return calculatorRepository.add(a,b);
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero!");
        return a/b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
}
