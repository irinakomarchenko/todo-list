package hexlet.code;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;


public class Main {

    static final String NAME = "name";
    static final String DESC = "desc";
    static final String STATUS = "status";


    public static void main(String[] args) {

        System.out.println("Welcome to Task manager!");

        List<Map<String, String>> tasks = new ArrayList<>();


        while (true) {
            System.out.println("1 - Print tasks");
            System.out.println("2 - Add task");
            System.out.println("3 -Change status");
            System.out.println("0 - Exit");
            System.out.println(" >");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1" -> {
                    System.out.println("All tasks");
                    if (tasks.isEmpty()) {
                        System.out.println("Tasks absent");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Map<String, String> task = tasks.get(i);
                            System.out.println("№ " + (i + 1));
                            System.out.println("Name: " + task.get(NAME));
                            System.out.println("Descrition: " + task.get(DESC));
                            System.out.println("Status: " + task.get(STATUS));
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Creating task");
                    Map<String, String> task = new HashMap<>();

                    System.out.println("Enter task name: ");
                    String taskName = scanner.nextLine();
                    task.put(NAME, taskName);

                    System.out.print("Enter task description: ");
                    String taskDesc = scanner.nextLine();
                    task.put(DESC, taskDesc);

                    System.out.print("Enter task status: ");
                    String taskStatus = scanner.nextLine();
                    task.put(STATUS, taskStatus);
                    tasks.add(task);
                }

                case "3" -> {
                    System.out.println("0task update");
                    if (tasks.isEmpty()) {
                        System.out.println("Tasks absent");
                    } else {
                        System.out.print("Enter task number update : ");
                        int taskId = scanner.nextInt();
                        scanner.nextLine();
                        Map<String, String> task = tasks.get(taskId - 1);
                        System.out.print("Enter task status: ");
                        String taskStatus = scanner.nextLine();
                        task.put(STATUS, taskStatus);

                    }

                }

                case "0" -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Command not supported");

            }

        }
    }
}
