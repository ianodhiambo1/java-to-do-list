// PriorityTask.java
public class PriorityTask implements Task {
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
