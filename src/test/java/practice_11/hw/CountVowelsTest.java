package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * "hello" → 2
 * "java" → 2
 * "AEIOU" → 5
 * "" → 0
 * "bcdfg" → 0
 * null → выброс IllegalArgumentException
 */
public class CountVowelsTest extends MethodsTest {

    public static Stream<Arguments> datasetForPositiveTest() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("bcdfg", 0)
        );
    }


    @ParameterizedTest
    @MethodSource("datasetForPositiveTest")
    public void countVowelsPositive(String input, int totalVowels) {
        assertEquals(totalVowels, methods.countVowels(input));
    }

    @Test
    public void countVowelsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.countVowels(null);
        }, "Count vowels in null string lead to IllegalArgumentException");
    }
}
