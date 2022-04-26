package calculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorServiсe {


    Integer calculatorPlus(Integer num1, Integer num2);

   Integer calculatorMinus(Integer num1, Integer num2);

    Integer calculatorMultiply(Integer num1, Integer num2);

     Integer calculatorDivide(Integer num1, Integer num2);
    }



