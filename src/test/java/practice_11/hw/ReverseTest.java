package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * "hello" → "olleh"
 * "Java" → "avaJ"
 * "" → ""
 * "a" → "a"
 * null → null
 * "12345" → "54321"
 */
public class ReverseTest extends MethodsTest {

    public static Stream<Arguments> datasetReverseString() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetReverseString")
    public void reverseStringPositive(String initial, String reversed) {
        assertEquals(reversed, methods.reverse(initial));
    }
}
