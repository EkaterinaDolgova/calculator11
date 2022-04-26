package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
        private int num1;
        private int num2;
        private int expected;

    public CalculatorServiceImplParameterizedTest(int num1, int num2, int expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }
    private static Stream<Arguments> argumentsForCalculatorTestsPlus() {
        return Stream.of(
                Arguments.of(2,1,3),
                Arguments.of(2,2,4),
                Arguments.of(3,3,6)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForCalculatorTestsPlus")
    public void paramTestPlus(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.calculatorPlus(num1,num2));
    }

    private static Stream<Arguments> argumentsForCalculatorTestsMinus() {
        return Stream.of(
                Arguments.of(2,1,1),
                Arguments.of(2,2,0),
                Arguments.of(3,3,0)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForCalculatorTestsMinus")
    public void paramTestMinus(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.calculatorMinus(num1,num2));
    }

    private static Stream<Arguments> argumentsForCalculatorTestsMultiply() {
        return Stream.of(
                Arguments.of(2,1,2),
                Arguments.of(2,2,4),
                Arguments.of(3,3,9)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForCalculatorTestsMultiply")
    public void paramTestMultiply(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.calculatorMultiply(num1,num2));
    }
}
