package complex_tasks.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> studentGrade) {
        if (studentGrade == null) {
            throw new InvalidGradeException("StudentGrade must not be null");
        }
        if (studentGrade.getGrade().doubleValue() <= 0) {
            throw new InvalidGradeException("Grade must not be negative or zero");
        }
        studentGradeList.add(studentGrade);
    }

    public synchronized double averageGradeBySubject(String subject) {
        if (subject == null) {
            throw new InvalidGradeException("Subject must not be null");
        }
        return studentGradeList.stream()
                .filter(s-> subject.equals(s.getSubject()))
                .mapToDouble(s-> s.getGrade().doubleValue())
                .average()
                .orElseThrow();
    }

    public synchronized int count() {
        return studentGradeList.size();
    }

    public List<StudentGrade<T>> getStudentGradeList() {
        return studentGradeList;
    }
}
