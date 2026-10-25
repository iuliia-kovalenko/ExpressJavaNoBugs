package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Корректные номера:
 * "+1 1234567890" → true.
 * "+44 9876543210" → true.
 * "+999 1111111111" → true.
 * Некорректные номера:
 * "12345" → false.
 * "invalid" → false.
 * "+1 abcdefghij" → false.
 * "+1234 1234567890" (слишком длинный код страны) → false.
 * "+1 123" (недостаточно цифр) → false.
 * "" (пустая строка) → false.
 */

public class IsValidPhoneNumberTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    public void validFormatOfPhoneNumber(String phoneNumber) {
        assertTrue(methods.isValidPhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", ""})
    public void notValidFormatOfPhoneNumber(String phoneNumber) {
        assertFalse(methods.isValidPhoneNumber(phoneNumber));
    }
}
