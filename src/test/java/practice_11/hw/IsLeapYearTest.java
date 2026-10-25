package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Обычные невисокосные годы: 2019, 2021, 2022 → false
 * Високосные годы: 2020, 2000, 1600 → true
 * Года, делящиеся на 100, но не на 400: 1900, 2100 → false
 * Граничные случаи: 0, 4, 400 → true
 */
public class IsLeapYearTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600, 0, 4, 400})
    public void leapYearPositive(int year) {
        assertTrue(methods.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
    public void leapYearNegative(int year) {
        assertFalse(methods.isLeapYear(year));
    }
}
