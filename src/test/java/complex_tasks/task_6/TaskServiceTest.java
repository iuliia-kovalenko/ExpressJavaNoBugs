package complex_tasks.task_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaskServiceTest {
    private TaskService<Integer> taskService;

    @BeforeEach
    public void setup() {
        taskService = new TaskService<>();
    }

    @Test
    public void addTaskAndTaskIsStoredTest() {
        Task<Integer> task = new Task<>(1, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));

        taskService.addTask(task);

        assertEquals(List.of(task), taskService.searchByStatus(Status.IN_PROGRESS));
    }

    @Test
    public void addTaskNullThrowsTest() {
        assertThrows(InvalidTaskServiceException.class, () -> {
            taskService.addTask(null);
        }, "Add null task lead to InvalidTaskServiceException");
    }

    @Test
    public void addTaskDuplicateIdThrowsTest() {
        Task<Integer> task = new Task<>(1, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        taskService.addTask(task);

        assertThrows(InvalidTaskServiceException.class, () -> {
            taskService.addTask(new Task<>(1, Status.DONE, Priority.MEDIUM, LocalDate.of(2026, 11, 1)));
        }, "Adding task with the same id lead to InvalidTaskServiceException");

        assertEquals(List.of(task), taskService.searchByStatus(Status.IN_PROGRESS));
    }

    @Test
    public void removeTaskExistingTaskIsRemovedTest() {
        Task<Integer> task1 = new Task<>(333, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        Task<Integer> task2 = new Task<>(444, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        taskService.addTask(task1);
        taskService.addTask(task2);

        taskService.removeTask(task1.getId());

        assertEquals(List.of(task2), taskService.searchByStatus(Status.IN_PROGRESS));
    }

    @Test
    public void removeTaskEmptyServiceThrowsTest() {
        assertThrows(InvalidTaskServiceException.class, () -> {
            taskService.removeTask(123);
        }, "Remove task from empty service lead to InvalidTaskServiceException");
    }

    @Test
    public void removeTaskUnknownIdThrowsTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        taskService.addTask(task1);

        assertThrows(InvalidTaskServiceException.class, () -> {
            taskService.removeTask(777);
        }, "Remove unknown task id from service lead to InvalidTaskServiceException");
    }

    @Test
    public void searchByStatusReturnsOnlyMatchingTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        Task<Integer> task2 = new Task<>(456, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        Task<Integer> task3 = new Task<>(789, Status.TESTING, Priority.HIGH, LocalDate.of(2026, 1, 1));

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        assertEquals(List.of(task1, task2), taskService.searchByStatus(Status.IN_PROGRESS));
    }

    @Test
    public void searchByStatusNoMatchReturnsEmptyListTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        taskService.addTask(task1);

        assertEquals(List.of(), taskService.searchByStatus(Status.TO_DO));
    }

    @Test
    public void searchByPriorityReturnsOnlyMatchingTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        Task<Integer> task2 = new Task<>(456, Status.IN_PROGRESS, Priority.SEVERE, LocalDate.of(2026, 1, 1));
        Task<Integer> task3 = new Task<>(789, Status.TESTING, Priority.SEVERE, LocalDate.of(2026, 1, 1));

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        assertEquals(List.of(task2, task3), taskService.searchByPriority(Priority.SEVERE));
    }

    @Test
    public void searchByPriorityNoMatchReturnsEmptyListTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 1, 1));
        taskService.addTask(task1);

        assertEquals(List.of(), taskService.searchByPriority(Priority.SEVERE));
    }

    @Test
    public void sortTaskByDateAscReturnsEarliestFirstTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 9, 11));
        Task<Integer> task2 = new Task<>(456, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.of(2025, 1, 1));
        Task<Integer> task3 = new Task<>(789, Status.TESTING, Priority.SEVERE, LocalDate.of(2026, 9, 1));

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        assertEquals(List.of(task2, task3, task1), taskService.sortTaskByDateAsc());
    }

    @Test
    public void sortTaskByDateDescReturnsLatestFirstTest() {
        Task<Integer> task1 = new Task<>(123, Status.IN_PROGRESS, Priority.HIGH, LocalDate.of(2026, 9, 11));
        Task<Integer> task2 = new Task<>(456, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.of(2025, 1, 1));
        Task<Integer> task3 = new Task<>(789, Status.TESTING, Priority.SEVERE, LocalDate.of(2026, 9, 1));

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        assertEquals(List.of(task1, task3, task2), taskService.sortTaskByDateDesc());
    }
}
