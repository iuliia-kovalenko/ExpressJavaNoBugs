package practice_7.solutions.complicated;

import java.time.LocalDateTime;
import java.util.Date;

public class Task implements Comparable<Task> {
    private String name;
    private LocalDateTime date;

    public Task(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // return negative - > if task has less priority -> deadline later
    // return 0 if ==
    // return positive -> if task has more priority -> deadline earlier
    @Override
    public int compareTo(Task task) {
        return this.date.compareTo(task.date);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}