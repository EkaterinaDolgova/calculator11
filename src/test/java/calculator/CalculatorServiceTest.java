package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

        @Test
        public void calculatorTest() {
            assertEquals(3, out.calculatorPlus(1, 2));
            assertEquals(7, out.calculatorPlus(5, 2));
            assertEquals(0, out.calculatorMinus(2, 2));
            assertEquals(8, out.calculatorMinus(10, 2));
            assertEquals(2, out.calculatorMultiply(1, 2));
            assertEquals(100, out.calculatorMultiply(50, 2));
            assertEquals(2, out.calculatorDivide(4, 2));
            assertEquals(5, out.calculatorDivide(10, 2));

        }
    }

