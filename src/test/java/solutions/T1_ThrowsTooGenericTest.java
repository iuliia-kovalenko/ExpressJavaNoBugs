package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T1_ThrowsTooGenericTest {

    static int parsePositive(String s) {
        int x =Integer.parseInt(s);
        if (x <= 0) throw new IllegalArgumentException("must be positive");
        return x;
    }

    @Test
    void test() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> parsePositive("0"));
        assertTrue(ex.getMessage().contains("must be positive"));
    }
}
