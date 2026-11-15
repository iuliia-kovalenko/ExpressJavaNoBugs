package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Корректный JSON:
 * Вход: "{"key":"value"}" → Выход: true.
 * Строка является валидным JSON, так как она представляет собой объект с ключом key и значением value.
 * Некорректный JSON:
 * Вход: "invalid json" → Выход: false.
 * Строка не является валидным JSON, так как она не соответствует никакому стандарту (например, отсутствуют кавычки, неправильный формат).
 * null:
 * Вход: null → Выход: false.
 * При передаче null метод должен вернуть false, так как нельзя создать JSON из null.
 */

public class IsValidJsonTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(strings = {"{\"key\":\"value\"}"})
    public void validJson(String json) {
        assertTrue(methods.isValidJson(json));
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid json"})
    public void notValidJson(String json) {
        assertFalse(methods.isValidJson(json));
    }

    @Test
    public void nullIsNotValidJson() {
        assertFalse(methods.isValidJson(null));
    }
}
