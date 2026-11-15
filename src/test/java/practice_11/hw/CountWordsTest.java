package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Обычная строка: "Hello world" → countWords() → 2.
 * Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
 * Пустая строка: "" → countWords() → 0.
 * Строка с пробелами: " " → countWords() → 0.
 * null строка: null → Должно выбрасываться IllegalArgumentException.
 */

public class CountWordsTest extends MethodsTest {

    public static Stream<Arguments> datasetForCountWordsPositive() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome ", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetForCountWordsPositive")
    public void countWordsPositive(String sentence, int totalWords) {
        assertEquals(totalWords, methods.countWords(sentence));
    }

    @Test
    public void countWordsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.countWords(null);
        }, "Count words in null sentence lead to IllegalArgumentException");
    }
}
