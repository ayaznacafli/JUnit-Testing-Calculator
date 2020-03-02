package com.ayaz.junit.impl;

import com.ayaz.junit.CalculatorRepository;
import com.ayaz.junit.CalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceImplTest {

    private  CalculatorService calculatorService;

    private CalculatorRepository calculatorRepository;

    @Before
    public void setUp(){
        calculatorRepository = mock(CalculatorRepository.class);
        calculatorService = new CalculatorServiceImpl(calculatorRepository);
    }

    @Test
    public void add() {
        when(calculatorService.add(20,10)).thenReturn(30);
    //    Assert.assertEquals(calculatorRepository.add(20, 10),30,0);
    //    int result = calculatorService.add(12,13);
    //    Assert.assertEquals(25,result);
    }

    @Test
    public void divide() {
    //    when(calculatorService.divide(12,3)).thenReturn(4);
        int result = calculatorService.divide(12,12);
        Assert.assertEquals(1,result);
    }

    @Test(expected = IllegalArgumentException.class,timeout = 0)
    public void testDivideByZero() {
        int result = calculatorService.divide(12, 0);
    }

    @Test
    public void multiply() {
       int result = calculatorService.multiply(10,10);
       Assert.assertEquals(100,result);
    }

    @Test
    public void subtract() {
        int result = calculatorService.subtract(17,7);
        Assert.assertEquals(10,result);
    }
}