package practice_11.hw;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Корректные email: "test@example.com", "user.name@domain.co", "a@b.cc" → true
 * Некорректные email: "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain" → false
 * Пустая строка: "" → false
 * null: null → false
 */

public class IsValidEmailTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    public void validEmail(String email) {
        assertTrue(methods.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain", ""})
    public void notValidEmail(String email) {
        assertFalse(methods.isValidEmail(email));
    }

    @Test
    public void notValidEmailForNull() {
        assertFalse(methods.isValidEmail(null));
    }
}
