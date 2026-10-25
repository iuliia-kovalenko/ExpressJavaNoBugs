package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
 * Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
 * Один элемент: [8] → Должно выбрасываться NoSuchElementException.
 * Пустой массив: [] → Должно выбрасываться NoSuchElementException.
 */

public class FindSecondMaxTest extends MethodsTest {

    public static Stream<Arguments> datasetForPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{-8, -1, 0}, -1)
        );
    }

    public static Stream<Arguments> datasetForNegativeCaseEqualNumbers() {
        return Stream.of(
                Arguments.of(new int[]{4, 4, 4, 4})
        );
    }

    public static Stream<Arguments> datasetForNegativeCaseEmptyArrayAndLengthLessThanOne() {
        return Stream.of(
                Arguments.of(new int[]{5}),
                Arguments.of(new int[0])
        );
    }

    @ParameterizedTest
    @MethodSource("datasetForPositiveCases")
    public void findSecondMaxPositive(int[] ints, int secondMax) {
        assertEquals(secondMax, methods.findSecondMax(ints));
    }

    @ParameterizedTest
    @MethodSource("datasetForNegativeCaseEqualNumbers")
    public void findSecondMaxNegativeEqualNumbers(int[] ints) {
        assertThrows(NoSuchElementException.class, () -> {
            methods.findSecondMax(ints);
        }, "Find second max in array with equal numbers lead to NoSuchElementException");
    }

    @ParameterizedTest
    @MethodSource("datasetForNegativeCaseEmptyArrayAndLengthLessThanOne")
    public void findSecondMaxNegativeEmptyArrayAndLenthLessThanOne(int[] ints) {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.findSecondMax(ints);
        }, "Find second max in array with length == 1 or empty array lead to IllegalArgumentException");
    }
}
