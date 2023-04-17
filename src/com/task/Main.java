package com.task;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author NghiaNV1
 * @version 1.0
 */
public class Main {
    /**
     * All Option of menu
     */
    private final static int ADD_TYPE = 1, DEL_TYPE = 2, DIS_TYPE = 3,
            ADD_TASK = 4, DEL_TASK = 5, DIS_TASK = 6, EXIT = 7;
    /**
     *
     * @param args default parameter
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            ManagementTask manage = new ManagementTask();
            do {
                System.out.println("============ Task Program =========");
                System.out.println("1. Add Task Type");
                System.out.println("2. Delete Task Type");
                System.out.println("3. Display Task Type");
                System.out.println("4. Add Task");
                System.out.println("5. Delete Task");
                System.out.println("6. Display Task");
                System.out.println("7. Exit");
                System.out.print("Please choice one option: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case ADD_TYPE:
                            System.out.println("---------- Add Task Type --------");
                            while (true) {
                                try {
                                    System.out.print("Name:");
                                    manage.addTaskType(scanner.nextLine());
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case DEL_TYPE:
                            System.out.println("---------- Del Task Type --------");
                            while (true) {
                                try {
                                    System.out.print("ID:");
                                    manage.deleteTaskType(scanner.nextLine());
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case DIS_TYPE:
                            System.out
                                    .println("----------"
                                            + " Display Task Type --------");
                            System.out.printf("%-5s%-15s%n", "ID", "Name");
                            for (TaskType type : manage.getDataTypeTasks()) {
                                System.out.printf("%-5s%-15s%n", type.getId(),
                                        type.getName());
                            }
                            break;
                        case ADD_TASK:
                            System.out.println("---------- Add Task --------");
                            String requirementName,
                                    assignee,
                                    reviewer,
                                    taskTypeID,
                                    date,
                                    planFrom,
                                    planTo;
                            while (true) {
                                try {
                                    System.out.print("Requirement Name:");
                                    requirementName = scanner.nextLine();
                                    System.out.print("Task Type:");
                                    taskTypeID = scanner.nextLine();
                                    System.out.print("Date:");
                                    date = scanner.nextLine();
                                    System.out.print("From:");
                                    planFrom = scanner.nextLine();
                                    System.out.print("To:");
                                    planTo = scanner.nextLine();
                                    System.out.print("Assignee:");
                                    assignee = scanner.nextLine();
                                    System.out.print("Reviewer:");
                                    reviewer = scanner.nextLine();
                                    manage.addTask(requirementName, assignee,
                                            reviewer, taskTypeID, date, planFrom,
                                            planTo);
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case DEL_TASK:
                            System.out.println("---------- Del Task  --------");
                            while (true) {
                                try {
                                    System.out.print("ID:");
                                    manage.deleteTask(scanner.nextLine());
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            break;
                        case DIS_TASK:
                            System.out.println("-----------------------------------"
                                    + "--------- Display Task ---------------------"
                                    + "---------------");
                            System.out.printf(
                                    "%-5s%-20s%-15s%-10s%-10s%-20s%-20s%n", "ID",
                                    "Name", "Task Type", "Date", "Time",
                                    "Assignee", "Reviewer");
                            SimpleDateFormat dateFormat = new SimpleDateFormat(
                                    "dd-MM-yyyy");
                            for (Task task : manage.getDataTasks()) {
                                System.out.printf(
                                        "%-5s%-20s%-15s%-10s%-10s%-20s%-20s%n",
                                        task.getId(), task.getRequirementName(),
                                        task.getTaskTypeID().getName(),
                                        dateFormat.format(task.getDate()),
                                        task.getPlanTo() - task.getPlanFrom(),
                                        task.getAssignee(), task.getReviewer());
                            }
                            break;
                        case EXIT:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please choice 1-7");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please choice 1-7");
                }
            } while (choice != EXIT);
        }
    }
}

