package practice_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class stringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {
    /*
     * Тесты для переворота строки
     * happy path: julia -> ailuj
     * corner case:
     *            - пустая строка "" -> ""
     *            - "a" -> "a"
     *            - null -> IllegalArgument Exception
     */

    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                Arguments.of("julia", "ailuj"),
                Arguments.of("", ""),
                Arguments.of("d", "d")
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString, "String reversed incorrectly!!!");
    }

    @Test
    public void userCannotReverseNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "reversing of null string should lead to IllegalArgumentException");
    }
}