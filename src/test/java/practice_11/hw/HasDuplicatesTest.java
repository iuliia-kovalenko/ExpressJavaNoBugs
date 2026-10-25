package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Без дубликатов:
 * Вход: [1, 2, 3, 4, 5] → Выход: false.
 * Массив не содержит повторяющихся элементов, поэтому результат будет false.
 * С дубликатами:
 * Вход: [1, 2, 2, 3] → Выход: true.
 * В массиве присутствуют одинаковые элементы, в данном случае 2, поэтому метод должен вернуть true.
 * Пустой массив:
 * Вход: [] → Выход: false.
 * Пустой массив не может содержать дубликатов, поэтому метод возвращает false.
 */

public class HasDuplicatesTest extends MethodsTest {
    public static Stream<Arguments> arraysWithDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3}),
                Arguments.of(new int[]{2, 2, 2, 2}),
                Arguments.of(new int[]{0, 0}),
                Arguments.of(new int[]{-1, 0, -1})
        );
    }

    public static Stream<Arguments> arraysWithoutDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 4, 3}),
                Arguments.of(new int[]{6}),
                Arguments.of(new int[0])
        );
    }

    @ParameterizedTest
    @MethodSource("arraysWithDuplicates")
    public void arrayHasDuplicates(int[] nums) {
        assertTrue(methods.hasDuplicates(nums));
    }

    @ParameterizedTest
    @MethodSource("arraysWithoutDuplicates")
    public void arrayHasNotDuplicates(int[] nums) {
        assertFalse(methods.hasDuplicates(nums));
    }
}
