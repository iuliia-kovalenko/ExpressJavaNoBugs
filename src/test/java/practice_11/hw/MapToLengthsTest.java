package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Обычный список:
 * Вход: ["Java", "C++", "Go"] → Выход: [4, 3, 2].
 * Каждая строка преобразуется в её длину: "Java" → 4, "C++" → 3, "Go" → 2.
 * Пустой список:
 * Вход: [] → Выход: [].
 * Для пустого списка возвращается также пустой список.
 */

public class MapToLengthsTest extends MethodsTest {
    public static Stream<Arguments> datasetForMapToLength() {
        return Stream.of(
                Arguments.of(List.of("Java", "C++", "Go"), List.of(4, 3, 2)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of("Java"), List.of(4))
        );
    }

    @ParameterizedTest
    @MethodSource("datasetForMapToLength")
    public void mapToLength(List<String> words, List<Integer> lengths) {
        assertEquals(lengths, methods.mapToLengths(words));
    }
}
