package complex_tasks.task_6;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskService<T> {
    private Map<T, Task<T>> tasks = new LinkedHashMap<>();

    public synchronized void addTask(Task<T> task) {
        if (task == null) {
            throw new InvalidTaskServiceException("Task can not be null");
        }
        if (tasks.containsKey(task.getId())) {
            throw new InvalidTaskServiceException("This task was already added in the list");
        }
        tasks.put(task.getId(), task);
    }

    public synchronized void removeTask(T id) {
        if (tasks.isEmpty()) {
            throw new InvalidTaskServiceException("Task list is empty, there is nothing to remove");
        }
        if (!tasks.containsKey(id)) {
            throw new InvalidTaskServiceException("This Id does not exist in the list");
        }
        tasks.remove(id);
    }

    public synchronized List<Task<T>> searchByStatus(Status status) {
        return tasks.values().stream()
                .filter(task -> task.getStatus() == status)
                .toList();
    }

    public synchronized List<Task<T>> searchByPriority(Priority priority) {
        return tasks.values().stream()
                .filter(task -> task.getPriority() == priority)
                .toList();
    }

    public synchronized List<Task<T>> sortTaskByDateAsc() {
        return tasks.values().stream()
                .sorted((t1, t2) -> t1.getLocalDate().compareTo(t2.getLocalDate()))
                .toList();
    }

    public synchronized List<Task<T>> sortTaskByDateDesc() {
        return tasks.values().stream()
                .sorted((t1, t2) -> t2.getLocalDate().compareTo(t1.getLocalDate()))
                .toList();
    }

    public synchronized void printAllTasks() {
        tasks.forEach((k, v) -> System.out.println("Id: " + k + ", Task: " + v));
    }
}
