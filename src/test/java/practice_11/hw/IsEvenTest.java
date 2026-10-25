package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends MethodsTest {


    @ParameterizedTest
    @ValueSource(ints = {2, 4})
    public void numberIsEven(int number) {
        assertTrue(methods.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void zeroIsEven(int number) {
        assertTrue(methods.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5})
    public void numberIsNotEven(int number) {
        assertFalse(methods.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5})
    public void negativeNumberIsNotEven(int number) {
        assertFalse(methods.isEven(number));
    }
}
