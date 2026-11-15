package solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T7 {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    @ParameterizedTest
    @CsvSource({
            "5, 1, 5",
            "3, 7, 7",
            "9, 9, 9"}
    )
    void t1(int a, int b, int expectedResult) {
        assertEquals(expectedResult, max(a, b));
    }
//
//    void t2() {
//        assertEquals(7, max(3, 7));
//    }
//
//    void t3() {
//        assertEquals(9, max(9, 9));
//    }

}
