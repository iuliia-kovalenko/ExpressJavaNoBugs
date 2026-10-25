package practice_11.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Обычная строка с разделителями:
 * Вход: "Java,Python,C++", разделитель: "," → Выход: ["Java", "Python", "C++"].
 * Строка будет разделена на три части по запятой.
 * Пустая строка с разделителем:
 * Вход: "", разделитель: "," → Выход: [""].
 * Если строка пуста, возвращается массив с единственным пустым элементом.
 * Строка без разделителя:
 * Вход: "word", разделитель: "," → Выход: ["word"].
 * Если разделитель отсутствует, то возвращается массив с одним элементом — самой строкой.
 */

public class SplitStringTest extends MethodsTest {

    public static Stream<Arguments> datasetStringsWithDelimiter() {
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", List.of("Java", "Python", "C++")),
                Arguments.of("Java:Python:C++", ":", List.of("Java", "Python", "C++")),
                Arguments.of("", ",", List.of("")),
                Arguments.of("word", ",", List.of("word"))
        );
    }

    @ParameterizedTest
    @MethodSource("datasetStringsWithDelimiter")
    public void splitStringWithDelimiter(String input, String delimiter, List<String> result) {
        assertEquals(result, Arrays.asList(methods.splitString(input, delimiter)));
    }
}
