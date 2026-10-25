package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
Обычный список:
Вход: ["Java", "C", "Python"] → Выход: ["C", "Java", "Python"].
Список с одинаковыми длинами:
Вход: ["aa", "bb", "cc"] → Выход: ["aa", "bb", "cc"].
Пустой список:
Вход: [] → Выход: [] (пустой список).
 */

public class SortByLengthTest extends MethodsTest {

    public static Stream<Arguments> datasetForSortByLength() {
        return Stream.of(
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("datasetForSortByLength")
    public void sortByLength(List<String> words, List<String> result) {
        assertEquals(result,methods.sortByLength(words));
    }
}
