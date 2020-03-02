package com.ayaz.mokito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceImplTest {


    @InjectMocks
    CalculatorService calculatorService = new CalculatorServiceImpl();
    @Mock
    CalculatorRepository calculatorRepository;

    // Create Mock
 /*   @Before
    public void setUp(){
        calculatorRepository = mock(CalculatorRepository.class);
        calculatorService = new CalculatorServiceImpl(calculatorRepository);
    }*/


    @Test
    public void add() {
        doThrow(new RuntimeException("Add operation not implemented")).when(calculatorRepository).add(10,20);
        when(calculatorRepository.add(10,20)).thenReturn(30);
        Assert.assertEquals(calculatorService.add(10, 20),30,0);
        verify(calculatorRepository).add(10,20);
    }

    @Test
    public void subtract() {
        when(calculatorRepository.subtract(20,10)).thenReturn(10);
        Assert.assertEquals(calculatorService.subtract(20, 10),10,0);
        verify(calculatorRepository).subtract(20,10);
    }

    @Test
    public void multiply() {
        when(calculatorRepository.multiply(10,10)).thenReturn(100);
        Assert.assertEquals(calculatorService.multiply(10, 10),100,0);
        verify(calculatorRepository).multiply(10,10);
    }

    @Test
    public void divide() {
        when(calculatorRepository.divide(12,3)).thenReturn(4);
        Assert.assertEquals(calculatorService.divide(12, 3),4,0);
        verify(calculatorRepository).divide(12,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        when(calculatorRepository.divide(12,0)).thenThrow(IllegalArgumentException.class);
        Assert.assertEquals(calculatorService.divide(12, 0),0,0);
        verify(calculatorRepository).divide(12,0);
    }


}