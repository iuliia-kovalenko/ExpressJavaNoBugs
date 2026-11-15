package complex_tasks.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student1 = new Student("Anna", 19, true);
        Student student2 = new Student("Ivan", 25, false);
        Student student3 = new Student("Petr", 31, true);
        Student student4 = new Student("Anna", 42, false);

        EntityManager<Student> manager = new EntityManager<>();
        manager.add(student1);
        manager.add(student2);
        manager.add(student3);
        manager.add(student4);

        System.out.println("---------------All students------------------");
        printStudents(manager.getAll());

        System.out.println("---------------Filter by age 20-35------------------");
        printStudents(manager.filterByAge(20, 35));

        System.out.println("---------------Filter by name Anna------------------");
        printStudents(manager.filterByName("Anna"));

        System.out.println("---------------Filter by active = true------------------");
        printStudents(manager.filterByActive(true));

        System.out.println("---------------Filter by active = false------------------");
        printStudents(manager.filterByActive(false));

        System.out.println("---------------Remove------------------");
        System.out.println("Remove Ivan: " + manager.remove(student2));
        System.out.println("Remove Ivan again: " + manager.remove(student2));
        printStudents(manager.getAll());

        System.out.println("---------------getAll returns a copy------------------");
        List<Student> copy = manager.getAll();
        try {
            copy.add(new Student("Olga", 20, true));
        } catch (UnsupportedOperationException e) {
            System.out.println("Returned list can not be changed: " + e.getClass().getSimpleName());
        }
        System.out.println("Students in manager: " + manager.getAll().size());

        System.out.println("---------------Add from several threads------------------");
        EntityManager<Student> concurrentManager = new EntityManager<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                concurrentManager.add(new Student("Thread1-" + i, 20, true));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                concurrentManager.add(new Student("Thread2-" + i, 30, false));
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Expected 2000, actual: " + concurrentManager.getAll().size());
    }

    private static void printStudents(List<Student> students) {
        students.forEach(s -> System.out.println(
                "Name: " + s.getName() + ", age: " + s.getAge() + ", active: " + s.isActive()));
    }
}
