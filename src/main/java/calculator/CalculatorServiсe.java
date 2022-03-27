package calculator;

import org.springframework.stereotype.Service;

@Service
public  interface CalculatorServiсe {


    public default String calculatorPlus(Integer num1, Integer num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;
    }
    public default String calculatorMinus(Integer num1, Integer num2) {
        int minus = num1 - num2;
        return num1 + "-" + num2 + "=" + minus;
    }

    public default String calculatorMultiply(Integer num1, Integer num2) {
        int multiply = num1 * num2;
        return num1 + "*" + num2 + "=" + multiply;
    }

    public default String calculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "Деление на 0 запрещено!";
        } else {
            int divide = num1 / num2;
            return num1 + "/" + num2 + "=" + divide;
        }
    }
}

