import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel typeLabel = new JLabel("Select the type of task:");
        JRadioButton regularRadioButton = new JRadioButton("Regular");
        JRadioButton priorityRadioButton = new JRadioButton("Priority");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(regularRadioButton);
        buttonGroup.add(priorityRadioButton);

        JLabel descriptionLabel = new JLabel("Task Description:");
        JTextField descriptionField = new JTextField();

        JButton addButton = new JButton("Add Task");
        JTextArea taskListArea = new JTextArea(10, 30);
        taskListArea.setEditable(false);

        panel.add(typeLabel);
        panel.add(regularRadioButton);
        panel.add(priorityRadioButton);
        panel.add(descriptionLabel);
        panel.add(descriptionField);
        panel.add(addButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(taskListArea), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        TaskManager taskManager = new TaskManager();

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String type = regularRadioButton.isSelected() ? "regular" : "priority";
                String description = descriptionField.getText();
                int priority = priorityRadioButton.isSelected() ? 1 : 0;

                taskManager.addTask(type, description, priority);
                descriptionField.setText("");
                taskListArea.setText(getTaskList(taskManager));
            }
        });
    }

    private static String getTaskList(TaskManager taskManager) {
        StringBuilder taskList = new StringBuilder();
        List<Task> tasks = taskManager.getTasks();
        for (Task task : tasks) {
            taskList.append("- ");
            taskList.append(task.toString());
            taskList.append("\n");
        }
        return taskList.toString();
    }
}