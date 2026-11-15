package complex_tasks.task_6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task<Integer> task1 =  new Task<>(1, Status.TO_DO, Priority.MEDIUM, LocalDate.of(2026, 11, 6));
        Task<Integer> task2 =  new Task<>(2, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.of(2026, 10, 16));
        Task<Integer> task3 =  new Task<>(3, Status.DONE, Priority.HIGH, LocalDate.of(2026, 9, 30));
        Task<Integer> task4 =  new Task<>(4, Status.DONE, Priority.HIGH, LocalDate.of(2026, 1, 1));

        TaskService<Integer> service = new TaskService<>();
        try {
            service.removeTask(1);
        } catch (InvalidTaskServiceException e) {
            System.out.println(e.getMessage());
        }

        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        service.printAllTasks();

        System.out.println(service.searchByPriority(Priority.HIGH));
        System.out.println(service.searchByPriority(Priority.MEDIUM));
        System.out.println(service.searchByPriority(Priority.SEVERE));
        System.out.println(service.searchByStatus(Status.TO_DO));
        System.out.println(service.searchByStatus(Status.TESTING));
        System.out.println(service.sortTaskByDateAsc());
        System.out.println(service.sortTaskByDateDesc());

        System.out.println("---------------Before remove------------------");
        service.printAllTasks();
        service.removeTask(2);
        System.out.println("---------------After remove------------------");
        service.printAllTasks();
        System.out.println("---------------Remove unexisting id------------------");

        try {
            service.removeTask(40);
        } catch (InvalidTaskServiceException e) {
            System.out.println(e.getMessage());
        }
    }
}
