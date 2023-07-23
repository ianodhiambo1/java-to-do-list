// RegularTask.java
public class RegularTask implements Task {
    private String description;

    public RegularTask(String description) {
        this.description = description;
    }

    public void displayTask() {
        System.out.println("Regular Task: " + description);
    }
}
