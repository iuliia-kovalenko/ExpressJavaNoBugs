package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class T5 {
    @Test
    void test() {
        String s = "abcв";
        assertAll(
                () -> assertEquals(3, s.length()),
                () -> assertTrue(s.startsWith("a"))
        );
    }

}
