package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{
    /**
     * happy path:
     *  - четное: "abba" -> true
     *  - нечетное "aha" -> true
     *  negative:
     *  - "julia" -> false
     * corner:
     *  - "a" -> true
     *  - "" -> true
     *  - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {"abba", "aha", "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);

    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrome() {
        String initialString = "john";
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.isPalindrome(null);
        }, "Checking if Null String is palindrome should lead to IllegalArgumentException");
    }
}
