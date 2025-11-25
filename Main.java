import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n===== Student Daily Task Tracker =====");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Sort Tasks Alphabetically");
            System.out.println("6. Save Tasks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    manager.addTask(title);
                    break;

                case 2:
                    manager.displayTasks();
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt() - 1;
                    manager.deleteTask(deleteIndex);
                    break;

                case 3:
                    manager.displayTasks();
                    System.out.print("Enter task number to mark completed: ");
                    int compIndex = sc.nextInt() - 1;
                    manager.markTaskCompleted(compIndex);
                    break;

                case 4:
                    manager.displayTasks();
                    break;

                case 5:
                    manager.sortTasks();
                    break;

                case 6:
                    manager.saveToFile();
                    break;

                case 7:
                    manager.saveToFile();
                    System.out.println("Exiting... Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
