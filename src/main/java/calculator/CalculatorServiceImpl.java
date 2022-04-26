package calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiсe{


    @Override
    public Integer calculatorPlus (Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer calculatorMinus (Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer calculatorMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer calculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 запрещено" + num2);
        } else
            return num1 / num2;
        }


    }

