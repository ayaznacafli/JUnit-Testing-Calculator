package com.ayaz.mokito;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private CalculatorRepository calculatorRepository;


    public CalculatorServiceImpl() {
    }

    public CalculatorServiceImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public int add(int a, int b) {
        return calculatorRepository.add(a,b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculatorRepository.subtract(a,b);
    }

    @Override
    public int multiply(int a, int b) {
        return calculatorRepository.multiply(a,b);
    }

    @Override
    public int divide(int a, int b) {
        return calculatorRepository.divide(a,b);
    }
}
