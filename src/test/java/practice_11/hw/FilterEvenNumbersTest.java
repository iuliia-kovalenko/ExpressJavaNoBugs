package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Обычный список:
 * Вход: [1, 2, 3, 4, 5, 6] → Выход: [2, 4, 6].
 * Список без чётных чисел:
 * Вход: [1, 3, 5] → Выход: [] (пустой список).
 * Пустой список:
 * Вход: [] → Выход: [] (пустой список).
 */
public class FilterEvenNumbersTest extends MethodsTest {

    public static Stream<Arguments> datasetFilterEvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                Arguments.of(List.of(0, 1, 2, 3, 4, 5, 6), List.of(0, 2, 4, 6)),
                Arguments.of(List.of(1, 3, 5), List.of()),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("datasetFilterEvenNumbers")
    public void filterEvenNumbers(List<Integer> ints, List<Integer> evenNumbers) {
        assertEquals(evenNumbers, methods.filterEvenNumbers(ints));
    }
}
