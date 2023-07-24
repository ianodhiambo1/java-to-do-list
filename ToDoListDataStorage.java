import java.util.ArrayList;

public class ToDoListDataStorage {
    private ArrayList<Task> taskList;

    public ToDoListDataStorage() {
        // Initialize the task list
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        // Add a new task to the list
        taskList.add(task);
    }

    public void updateTask(int index, Task updatedTask) {
        // Update an existing task at the given index
        if (index >= 0 && index < taskList.size()) {
            taskList.set(index, updatedTask);
        }
    }

    public void removeTask(int index) {
        // Remove a task from the list at the given index
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        }
    }

    public ArrayList<Task> getAllTasks() {
        // Return a copy of the task list
        return new ArrayList<>(taskList);
    }

    // Test cases
    public static void main(String[] args) {
        ToDoListDataStorage dataStorage = new ToDoListDataStorage();

        // Create and add tasks
        Task task1 = new Task("Buy groceries", false);
        Task task2 = new Task("Finish report", true);
        Task task3 = new Task("Go for a walk", true);
        dataStorage.addTask(task1);
        dataStorage.addTask(task2);
        dataStorage.addTask(task3);

        // Display all tasks
        ArrayList<Task> allTasks = dataStorage.getAllTasks();
        System.out.println("All Tasks:");
        for (Task task : allTasks) {
            System.out.println(task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }

        // Update a task
        Task updatedTask = new Task("Updated Task", true);
        dataStorage.updateTask(0, updatedTask);

        // Display all tasks after the update
        allTasks = dataStorage.getAllTasks();
        System.out.println("\nAll Tasks after update:");
        for (Task task : allTasks) {
            System.out.println(task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }

        // Remove a task
        dataStorage.removeTask(1);

        // Display all tasks after the removal
        allTasks = dataStorage.getAllTasks();
        System.out.println("\nAll Tasks after removal:");
        for (Task task : allTasks) {
            System.out.println(task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }
}

class Task {
    private String description;
    private boolean completed;

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
