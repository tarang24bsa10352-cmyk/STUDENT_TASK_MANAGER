import java.io.*;
import java.util.*;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private final String FILE_NAME = "tasks.txt";

    public TaskManager() {
        loadFromFile();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Task added successfully!");
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
            return;
        }
        System.out.println("\n---- All Tasks ----");
        int i = 1;
        for (Task task : tasks) {
            System.out.println(i + ". " + task);
            i++;
        }
    }

    public void sortTasks() {
        tasks.sort(Comparator.comparing(Task::getTitle));
        System.out.println("Tasks sorted alphabetically!");
    }

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.println(task.getTitle() + "," + task.isCompleted());
            }
            System.out.println("Tasks saved to file!");
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    private void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Task t = new Task(data[0]);
                if (data[1].equals("true")) {
                    t.markCompleted();
                }
                tasks.add(t);
            }
        } catch (IOException e) {
            // ignore, file will be created later
        }
    }
}
