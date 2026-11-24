package complex_tasks.task_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StudentGrade<Integer> studentGrade1 = new StudentGrade<>("Petr", "math", 5);
        StudentGrade<Integer> studentGrade2 = new StudentGrade<>("Ivan", "math", 5);
        StudentGrade<Integer> studentGrade3 = new StudentGrade<>("Sergey", "math", 5);

        GradeService<Integer> integerGradeService = new GradeService<>();

        integerGradeService.addGrade(studentGrade1);
        integerGradeService.addGrade(studentGrade2);
        integerGradeService.addGrade(studentGrade3);

        System.out.println(integerGradeService.averageGradeBySubject("math"));

        StudentGrade<Double> studentGrade4 = new StudentGrade<>("Petr", "math", 7.5);
        StudentGrade<Double> studentGrade5 = new StudentGrade<>("Ivan", "math", 5.5);

        GradeService<Double> doubleGradeService = new GradeService<>();
        doubleGradeService.addGrade(studentGrade4);
        doubleGradeService.addGrade(studentGrade5);

        System.out.println(doubleGradeService.averageGradeBySubject("math"));
//        System.out.println(doubleGradeService.averageGradeBySubject("english"));

        GradeService<Double> threads = new GradeService<>();
        StudentGrade<Double> studentGrade6 = new StudentGrade<>("Petr", "math", 7.5);

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 10000; i++) {
            executorService.execute(()-> threads.addGrade(studentGrade6));
        }

        executorService.shutdown();
        executorService.awaitTermination(300, TimeUnit.MILLISECONDS);
        System.out.println(threads.count());
    }
}
