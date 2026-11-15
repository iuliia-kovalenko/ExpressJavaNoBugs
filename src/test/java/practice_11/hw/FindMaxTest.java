package practice_11.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * [3, 5, 7, 2] → 7
 * [1] → 1
 * [-3, -5, -7, -2] → -2
 * [] → выбрасывает NoSuchElementException
 * null → выбрасывает IllegalArgumentException
 */

public class FindMaxTest extends MethodsTest {

    public static Stream<Arguments> datasetFindMaxNumber() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2} , 7),
                Arguments.of(new int[]{1} , 1),
                Arguments.of(new int[]{-3, -5, -7, -2} , -2),
                Arguments.of(new int[]{3, 5, 7, 2, 0} , 7),
                Arguments.of(new int[]{-3, -5, -7, -2, 0} , 0),
                Arguments.of(new int[]{-1, 0, 1} , 1)
        );
    }

    @ParameterizedTest
    @MethodSource("datasetFindMaxNumber")
    public void findMaxPositiveNumbers(int[] ints, int max) {
        assertEquals(max, methods.findMax(ints));
    }

    @Test
    public void findMaxEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
            methods.findMax(new int[0]);
        }, "Find max in empty array lead to NoSuchElementException");
    }

    @Test
    public void findMaxNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.findMax(null);
        }, "Find max in null array lead to IllegalArgumentException");
    }
}
