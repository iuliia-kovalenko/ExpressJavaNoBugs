package practice_7.hw_edditional_tasks;

import java.util.ArrayDeque;

public class TaskProcess {
    private ArrayDeque<String> tasks;

    public TaskProcess() {
        this.tasks = new ArrayDeque<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void getCurrentTask() {
        String currentTask = tasks.poll();
        System.out.println("Processing: " + currentTask);
    }

    public void getAllTasks() {
        tasks.forEach(System.out::println);
    }

    public void processAll() {
        while (!tasks.isEmpty()) {
            getCurrentTask();
        }
    }

    public static void main(String[] args) {
        TaskProcess taskProcess = new TaskProcess();
        taskProcess.addTask("Task_1");
        taskProcess.addTask("Task_2");
        taskProcess.addTask("Task_3");
        taskProcess.addTask("Task_4");
        taskProcess.addTask("Task_5");
        taskProcess.addTask("Task_6");
        taskProcess.getAllTasks();
        taskProcess.getCurrentTask();
        taskProcess.getAllTasks();
        taskProcess.processAll();
        System.out.println("-------After process all tasks-------");
        taskProcess.getAllTasks();
    }
}
