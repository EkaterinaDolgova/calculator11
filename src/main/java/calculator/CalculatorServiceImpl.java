package calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiсe{


    @Override
    public String calculatorPlus(Integer num1, Integer num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;
    }

    @Override
    public String calculatorMinus(Integer num1, Integer num2) {
        return null;
    }

    @Override
    public String calculatorMultiply(Integer num1, Integer num2) {
        return null;
    }

    @Override
    public String calculatorDivide(Integer num1, Integer num2) {
        return null;
    }
}
