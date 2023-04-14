package com.baithi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager {
    private List<TaskType> taskTypes;
    private List<Task> tasks;

    public TaskManager() {
        this.taskTypes = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public int addTaskType(String name) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Task type name cannot be empty.");
        }

        int id = taskTypes.size() > 0 ? taskTypes.get(taskTypes.size() - 1).getId() + 1 : 1;
        TaskType taskType = new TaskType(id, name);
        taskTypes.add(taskType);

        return id;
    }

    public void deleteTaskType(int id) throws Exception {
        boolean isDeleted = false;
        for (int i = 0; i < taskTypes.size(); i++) {
            if (taskTypes.get(i).getId() == id) {
                taskTypes.remove(i);
                isDeleted = true;
                break;
            }
        }

        if (!isDeleted) {
            throw new Exception("Task type not found.");
        }
    }

    public List<TaskType> getDataTypeTasks() {
        return taskTypes;
    }

    public int addTask(String requirementName, String assignee, String reviewer, int taskTypeID, String dateStr, double planFrom, double planTo) throws Exception {
        if (requirementName == null || requirementName.isEmpty()) {
            throw new Exception("Requirement name cannot be empty.");
        }

        if (assignee == null || assignee.isEmpty()) {
            throw new Exception("Assignee name cannot be empty.");
        }

        if (reviewer == null || reviewer.isEmpty()) {
            throw new Exception("Reviewer name cannot be empty.");
        }

        TaskType taskType = getTaskTypeById(taskTypeID);
        if (taskType == null) {
            throw new Exception("Invalid task type ID.");
        }

        Date date = parseDate(dateStr);
        if (date == null) {
            throw new Exception("Invalid date format. Use dd-MM-yyyy format.");
        }

        Task task = new Task(tasks.size() > 0 ? tasks.get(tasks.size() - 1).getId() + 1 : 1, taskTypeID, requirementName, date, planFrom, planTo, assignee, reviewer);

        if (!task.isValidDate()) {
            throw new Exception("Invalid date format. Use dd-MM-yyyy format.");
        }

        if (!task.isWithinWorkingHours()) {
            throw new Exception("Plan from and plan to should be between 8:00 AM and 5:30 PM.");
        }

        tasks.add(task);

        return task.getId();
    }

    public void deleteTask(int id) throws Exception {
        boolean isDeleted = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                isDeleted = true;
                break;
            }
        }

        if (!isDeleted) {
            throw new Exception("Task not found.");
        }
    }

    public List<Task> getDataTasks() {
        return tasks;
    }

    public TaskType getTaskTypeById(int id) {
        for (TaskType taskType : taskTypes) {
            if (taskType.getId() == id) {
                return taskType;
            }
        }

        return null;
    }

    private Date parseDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(dateStr);
            return date;
        } catch (Exception e) {
            return null;
        }
    }
}