package com.ayaz.junit;

import org.springframework.stereotype.Repository;


@Repository
public interface CalculatorRepository {
    int add(int a,int b);
}
