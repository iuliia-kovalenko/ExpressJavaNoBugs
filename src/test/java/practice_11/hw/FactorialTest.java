package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Базовый случай: factorial(0) → 1
 * Обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
 * Отрицательные числа: factorial(-3) → Должно выбрасывать IllegalArgumentException.
 */

public class FactorialTest extends MethodsTest {

    public static Stream<Arguments> datasetForFactorialPositive() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetForFactorialPositive")
    public void factorialPositive(int number, int factorialOfNumber) {
        assertEquals(factorialOfNumber, methods.factorial(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5})
    public void factorialNegative(int num) {
        assertThrows(IllegalArgumentException.class, ()-> {
            methods.factorial(num);
        }, "Factorial of negative number lead to IllegalArgumentException");
    }
}
