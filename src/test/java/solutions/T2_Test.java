package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class T2_Test {

    static int div(int a, int b) {
        return a / b;
    }

    @Test
    void test() {
        assertThrows(ArithmeticException.class, () -> div(1,0));
    }
}
