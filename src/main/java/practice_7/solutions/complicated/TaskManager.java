package practice_7.solutions.complicated;

import java.util.Collections;
import java.util.LinkedList;

/**
 * tasks list
 * save tasks list, that can de added, delete, sort by execution time
 * algorythm
 * 1) choose data structure -> linear structure, LinkedList or ArrayList ???
 * what actions (access often - > ArrayList,
 * if rare access anf oftem change -add, delete.. -> LinkedList)
 * LinkedList
 * 2) Create elements
 * - Task -> deadline - date, String name
 * 3) How to implement sort
 */
public class TaskManager {
    private LinkedList<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Task: " + task.getName() + " added");
    }

    public void removeTaskByName(String name) {
        // find task
        Task foundTask = null;
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                foundTask = task;
            }
        }
        if (foundTask == null) {
            System.out.println("Task with name: " + name + " was not found");
            return;
        }
        this.tasks.remove(foundTask);
        System.out.println("Task with name: " + name + " was deleted");
    }

    public LinkedList<Task> sortByDeadline() {
        // override existing sort
        // sort for primitives works by default
        LinkedList<Task> sortedTasks = new LinkedList<>(tasks);
        Collections.sort(sortedTasks);
        System.out.println("Sorted successfully");
        return sortedTasks;

    }
}
