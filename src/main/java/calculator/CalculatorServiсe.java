package calculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorServiсe {


    public default Integer calculatorPlus(Integer num1, Integer num2) {
        return null;
    }

    public default Integer calculatorMinus(Integer num1, Integer num2) {
        return null;
    }

    public default Integer calculatorMultiply(Integer num1, Integer num2) {
        return null;
    }

    public default Integer calculatorDivide(Integer num1, Integer num2) {

        return null;
    }
}


