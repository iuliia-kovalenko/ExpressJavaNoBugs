package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class T4 {
    @Test
    void test() {
        int[] a = {1, 2};
        int[] b = {1, 2};
//        assertEquals(a, b); //ссылки, всегда будет false
        assertArrayEquals(a, b);
    }
}
