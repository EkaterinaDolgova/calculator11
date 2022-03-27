package calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
        private final CalculatorServiсe calculatorServiсe;

    public CalculatorController(CalculatorServiсe calculatorServiсe) {
        this.calculatorServiсe = calculatorServiсe;
    }

    @GetMapping(path = "/calculator")
    public String Calculator() {
        return "<b><i>Добро пожаловать в калькулятор</i></b>";
    }

    @GetMapping(path = "/calculator/plus")
    public String CalculatorPlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String CalculatorMinus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String CalculatorMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String CalculatorDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num2 == 0) {
            return "Деление на 0 запрещено!";
        } else {
            return calculatorServiсe.calculatorDivide(num1, num2);
        }

    }
}

