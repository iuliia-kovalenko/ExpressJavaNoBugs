package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Обычный массив:
 * Вход: [1, 2, 3, 4, 5] → Выход: 3.0.
 * Среднее значение элементов массива: (1 + 2 + 3 + 4 + 5) / 5 = 3.0.
 * Массив с одним элементом:
 * Вход: [10] → Выход: 10.0.
 * Среднее значение для одного элемента равно самому элементу.
 * Пустой массив:
 * Вход: [] → Выход: Исключение NoSuchElementException.
 * Для пустого массива выбрасывается исключение, так как среднее значение вычислить невозможно.
 */

public class FindAverageTest extends MethodsTest {

    public static Stream<Arguments> datasetNotEmptyArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[]{10}, 10.0),
                Arguments.of(new int[]{0}, 0.0),
                Arguments.of(new int[]{1,2}, 1.5)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetNotEmptyArray")
    public void findAverageNotEmptyArray(int[] numbers, double average) {
        assertEquals(average, methods.findAverage(numbers));
    }

    @Test
    public void findAverageEmptyArray() {
        assertThrows(NoSuchElementException.class, ()-> {
            methods.findAverage(new int[0]);
        }, "Find average in empty array lead to NoSuchElementException");
    }
}
