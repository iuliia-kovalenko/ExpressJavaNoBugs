package solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class T8 {

    static List<Integer> top2(List<Integer> xs) {
        return xs.stream().sorted().limit(2).toList();
    }

    static Stream<Arguments> top2Data() {
        return Stream.of(
                Arguments.of(List.of(5, 1, 3), List.of(1, 3)),
                Arguments.of(List.of(4, 4, 1), List.of(1, 4)),
                Arguments.of(List.of(2, 1),    List.of(1, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("top2Data")
    void test(List<Integer> input, List<Integer> expected) {
        List<Integer> actual = top2(input);

        assertAll(
                () -> assertEquals(2, actual.size()),
                () -> assertEquals(expected, actual)
        );
    }
}
