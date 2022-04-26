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
    public String calculator() {
        return "<b><i>Добро пожаловать в калькулятор</i></b>";
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorServiсe.calculatorPlus(num1,num2);
        return num1 + "+" + num2 + "=" + result ;
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorServiсe.calculatorMinus(num1,num2);
        return num1 + "-" + num2 + "=" + result ;
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorServiсe.calculatorMultiply(num1,num2);
        return num1 + "*" + num2 + "=" + result ;
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam Integer num1, @RequestParam Integer num2) {
            Integer result = calculatorServiсe.calculatorDivide(num1,num2);
            return num1 + "/" + num2 + "=" + result ;
        }

    }


