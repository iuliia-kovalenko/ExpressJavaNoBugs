package practice_7.solutions.complicated;

import java.awt.image.LookupOp;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Task3", LocalDateTime.of(2026, 9, 15, 10, 0));
        Task task2 = new Task("Task2", LocalDateTime.now());
        Task task3 = new Task("Task1", LocalDateTime.of(2026, 8, 1, 9, 30));

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        System.out.println(taskManager.sortByDeadline());
        taskManager.removeTaskByName("Task1");
        taskManager.removeTaskByName("Task1888");

    }
}
