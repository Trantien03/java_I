package com.baithi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Task program =====");
            System.out.println("1. Add Task Type");
            System.out.println("2. Delete Task Type");
            System.out.println("3. Display Task Types");
            System.out.println("4. Add Task");
            System.out.println("5. Delete Task");
            System.out.println("6. Display Task");
            System.out.println("7. Exit");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addTaskType();
                    break;
                case 2:
                    deleteTaskType();
                    break;
                case 3:
                    listTaskTypes();
                    break;
                case 4:
                    addTask();
                    break;
                case 5:
                    deleteTask();
                    break;
                case 6:
                    listTasks();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
            }
            System.out.println(" Please choose a number from 1 to 7: ");
        }
    }

    static void addTaskType() {
        System.out.println("----- Add Task Type -----");
        System.out.print(" Name: ");
        String name = scanner.next();

        try {
            int id = taskManager.addTaskType(name);
            System.out.println("Task type with ID " + id + " added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding task type: " + e.getMessage());
        }
    }

    static void deleteTaskType() {
        System.out.println("----- Del Task Type -----");
        System.out.print("ID: ");
        int id = scanner.nextInt();

        try {
            taskManager.deleteTaskType(id);
            System.out.println("Task type with ID " + id + " deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting task type: " + e.getMessage());
        }
    }

    static void listTaskTypes() {
        System.out.println("\nTask types:");
        for (TaskType taskType : taskManager.getDataTypeTasks()) {
            System.out.println(taskType.getId() + ". " + taskType.getName());
        }
    }


    static void addTask() {
        System.out.println("----- Add Task -----");

        System.out.print("Requirement name: ");
        String requirementName = scanner.next();

        System.out.print("Task Type: ");
        int taskTypeID = scanner.nextInt();

        System.out.print("Date (dd-MM-yyyy): ");
        String dateStr = scanner.next();

        System.out.print("From: ");
        double planFrom = scanner.nextDouble();

        System.out.print("To: ");
        double planTo = scanner.nextDouble();

        System.out.print("Assignee name: ");
        String assignee = scanner.next();

        System.out.print("Reviewer name: ");
        String reviewer = scanner.next();

        try {
            int id = taskManager.addTask(requirementName, assignee, reviewer, taskTypeID, dateStr, planFrom, planTo);
            System.out.println("Task with ID " + id + " added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding task: " + e.getMessage());
        }
    }

    static void deleteTask() {
        System.out.println("----- Del Task -----");
        System.out.print(" ID: ");
        int id = scanner.nextInt();

        try {
            taskManager.deleteTask(id);
            System.out.println("Task with ID " + id + " deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting task: " + e.getMessage());
        }
    }

    static void listTasks() {
        System.out.println("\nTasks:");
        for (Task task : taskManager.getDataTasks()) {
            String taskTypeName = taskManager.getTaskTypeById(task.getTaskID()).getName();
            System.out.println(task.getId() + ". " + task.getRequirementName() + " (" + taskTypeName + ")");
        }
    }
}
