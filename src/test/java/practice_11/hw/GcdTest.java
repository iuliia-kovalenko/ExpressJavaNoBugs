package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Обычные числа:
 * Вход: 24, 36 → Выход: 12.
 * Наибольший общий делитель между 24 и 36 равен 12.
 * Простые числа:
 * Вход: 101, 103 → Выход: 1.
 * Простые числа всегда имеют НОД равный 1, так как они не делятся друг на друга.
 * Нулевое значение:
 * Вход: 0, 10 → Выход: 10.
 * Когда одно из чисел равно 0, НОД всегда равен другому числу (в данном случае 10).
 */
public class GcdTest extends MethodsTest {
    public static Stream<Arguments> datasetGcd() {
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10),
                Arguments.of(10, 0, 10),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetGcd")
    public void gcd(int first, int second, int result) {
        assertEquals(result, methods.gcd(first, second));
    }
}
