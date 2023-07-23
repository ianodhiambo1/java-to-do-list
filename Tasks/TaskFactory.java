// TaskFactory.java
public class TaskFactory {
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
