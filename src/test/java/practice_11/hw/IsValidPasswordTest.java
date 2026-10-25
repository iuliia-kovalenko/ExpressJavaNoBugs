package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Корректный пароль:
 * Вход: "Password1" → Выход: true.
 * Пароль имеет длину больше 8 символов, содержит хотя бы одну заглавную букву и одну цифру.
 * Пароль, который слишком короткий:
 * Вход: "pass" → Выход: false.
 * Пароль слишком короткий, не соответствует минимальной длине.
 * Пароль с отсутствием цифры или заглавной буквы:
 * Вход: "password" → Выход: false.
 * Пароль не содержит ни цифры, ни заглавной буквы.
 * Null пароль:
 * Вход: null → Выход: false.
 * Метод должен корректно обработать null и вернуть false.
 */
public class IsValidPasswordTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(strings = {"Password1", "Password12", "Passwor1"})
    public void validPassword(String password) {
        assertTrue(methods.isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pass", "passwordd","PasswordD", "Passwo1", "password1"})
    public void notValidPassword(String password) {
        assertFalse(methods.isValidPassword(password));
    }

    @Test
    public void nullIsNotValidPassword() {
        assertFalse(methods.isValidPassword(null));
    }
}
