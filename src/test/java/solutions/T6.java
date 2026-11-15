package solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T6 {
    private List<Integer> xs;

    @BeforeEach
    void setup() {
        xs = new ArrayList<>();

    }


    @Test
    void t1() {
        xs.add(1);
        assertEquals(1, xs.size());
    }

    @Test
    void t2() {
        xs.add(1);
        xs.add(2);
        assertEquals(2, xs.size());
    }
}
