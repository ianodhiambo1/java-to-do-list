import java.util.ArrayList;
import java.util.List;

interface Task {
    void displayTask();
}
class RegularTask implements Task {
    private String description;

    public RegularTask(String description) {
        this.description = description;
    }

    public void displayTask() {
        System.out.println("Regular Task: " + description);
    }

class PriorityTask implements Task {
    private String description;
    private int priority;

    public PriorityTask(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public void displayTask() {
        System.out.println("Priority Task (Priority " + priority + "): " + description);
    }
}
class TaskFactory {
    public static Task createTask(String type, String description, int priority) {
        if (type.equalsIgnoreCase("regular")) {
            return new RegularTask(description);
        } else if (type.equalsIgnoreCase("priority")) {
            return new PriorityTask(description, priority);
        } else {
            throw new IllegalArgumentException("Invalid type of task. Select again.");
        }
    }
}
class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String type, String description, int priority) {
        Task task = TaskFactory.createTask(type, description, priority);
        tasks.add(task);
    }

    public void displayTasks() {
        for (Task task : tasks) {
            task.displayTask();
        }
    }
}

// UI mock class
class UserInterface {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("regular", "Buy groceries", 0);
        taskManager.addTask("priority", "Finish report", 1);
        taskManager.addTask("regular", "Go for a walk", 0);

        System.out.println("Tasks in the to-do list:");
        taskManager.displayTasks();
    }
}
