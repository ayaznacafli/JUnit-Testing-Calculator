package com.ayaz;

import com.ayaz.mokito.CalculatorService;
import com.ayaz.mokito.CalculatorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        CalculatorService calculatorService = context.getBean(CalculatorService.class);

        System.out.println(calculatorService.add(12,12));
    }

}
