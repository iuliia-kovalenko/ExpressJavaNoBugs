package complex_tasks.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    private GradeService<Number> gradeService;

    @BeforeEach
    public void setUp() {
        gradeService = new GradeService<>();
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 10})
    public void addOneGradeIntPositiveTest(int grade) {
        gradeService.addGrade(new StudentGrade<>("Petr", "math", grade));

        assertEquals(1, gradeService.count());
        assertEquals(grade, gradeService.getStudentGradeList().getFirst().getGrade());
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 1.0, 10.0})
    public void addOneGradeDoublePositiveTest(double grade) {
        gradeService.addGrade(new StudentGrade<>("Petr", "math", grade));

        assertEquals(1, gradeService.count());
        assertEquals(grade, gradeService.getStudentGradeList().getFirst().getGrade());
    }

    @Test
    public void addMoreThanOneGradePositiveTest() {
        StudentGrade<Number> studentGrade1 = new StudentGrade<>("Petr", "math", 4.0);
        gradeService.addGrade(studentGrade1);
        StudentGrade<Number> studentGrade2 = new StudentGrade<>("Ivan", "math", 5.0);
        gradeService.addGrade(studentGrade2);

        assertEquals(2, gradeService.count());
        assertEquals(studentGrade1, gradeService.getStudentGradeList().getFirst());
        assertEquals(studentGrade2, gradeService.getStudentGradeList().getLast());
    }

    public static Stream<Arguments> dataSetNegative() {
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(0),
                Arguments.of(-0.1)
        );
    }


    @ParameterizedTest
    @MethodSource("dataSetNegative")
    public void addGradeNegativeTest(Number grade) {
        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(new StudentGrade<>("Ivan", "history", grade));
        }, "Add not positive number lead to InvalidGradeException");
        assertEquals(0, gradeService.count());
    }

    @Test
    public void averageGradeIntPositiveTest() {
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 5));
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 6));
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 10));

        double expected = 7.0;
        assertEquals(expected, gradeService.averageGradeBySubject("history"));
    }

    @Test
    public void averageGradeIntEpsPositiveTest() {
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 5));
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 6));
        gradeService.addGrade(new StudentGrade<>("Ivan", "history", 9));

        double expected = 6.66;
        assertEquals(expected, gradeService.averageGradeBySubject("history"), 2);
    }


    @Test
    public void averageGradeNegativeTest() {
        assertThrows(InvalidGradeException.class, () -> {
            gradeService.averageGradeBySubject(null);
        }, "Null in subject lead to InvalidGradeException");
    }
}


