import java.util.ArrayList;
import java.util.List;

// TaskManager.java
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String type, String description, int priority) {
        Task task = TaskFactory.createTask(type, description, priority);
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
