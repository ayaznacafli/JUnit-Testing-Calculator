package com.ayaz.junit.impl;

import com.ayaz.junit.CalculatorRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepositoryImpl implements CalculatorRepository {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
