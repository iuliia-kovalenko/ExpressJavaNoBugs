package practice_11;

import org.junit.jupiter.api.BeforeEach;
import practice_11.lecture.StringProcessor;

public class StringProcessorTest {
    protected StringProcessor stringProcessor;

    @BeforeEach
    public void setupTest() {
        stringProcessor = new StringProcessor();
    }
}
