package complex_tasks.task_6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {
    private T id;
    private Status status;
    private Priority priority;
    private LocalDate localDate;

    public Task(T id, Status status, Priority priority, LocalDate localDate) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.localDate = localDate;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status=" + status +
                ", priority=" + priority +
                ", localDate=" + localDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(getId(), task.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
