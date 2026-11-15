package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Анаграммы:
 * Вход: "listen", "silent" → Выход: true.
 * Строки являются анаграммами, так как после сортировки символов они совпадают.
 * Не анаграммы:
 * Вход: "java", "python" → Выход: false.
 * Строки не являются анаграммами, так как их символы не совпадают после сортировки.
 * null:
 * Вход: null, "word" → Выход: false.
 * Если одна из строк равна null, метод возвращает false.
 */

public class IsAnagramTest extends MethodsTest {

    public static Stream<Arguments> datasetValidAnagramWords() {
        return Stream.of(
                Arguments.of("listen", "silent"),
                Arguments.of("Listen", "silenT")
        );
    }

    public static Stream<Arguments> datasetNotValidAnagramWords() {
        return Stream.of(
                Arguments.of("java", "python"),
                Arguments.of("d", "f")
        );
    }

    public static Stream<Arguments> nullInputs() {
        return Stream.of(
                Arguments.of(null, "sjfhsgfhj"),
                Arguments.of("hjdsfghdsg", null),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetValidAnagramWords")
    public void wordsAreAnagram(String first, String second) {
        assertTrue(methods.isAnagram(first, second));
    }

    @ParameterizedTest
    @MethodSource("datasetNotValidAnagramWords")
    public void wordsAreNotAnagram(String first, String second) {
        assertFalse(methods.isAnagram(first, second));
    }

    @ParameterizedTest
    @MethodSource("nullInputs")
    public void wordWithNullIsNotAnagram(String first, String second) {
        assertFalse(methods.isAnagram(first, second));
    }
}
