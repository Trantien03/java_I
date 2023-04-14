package com.class7.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManagement {

    List<Task> listTask;

    public TaskManagement() {
        listTask = new ArrayList<Task>();
    }

    private void validateFromTo(String planFrom, String planTo) throws Exception {
        try {
            float from = Float.parseFloat(planFrom);
            float to = Float.parseFloat(planTo);

            if(from >  to) {
                throw new Exception("From can not > to");
            }

        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void addTask(String requirementName, String assignee,
                        String reviewer, String date, String planFrom,
                        String planTo) throws Exception {
        //validation
        if(requirementName.equals("")) {
            throw new Exception("Requirement can not be empty");
        }
        if(assignee.equals("")) {
            throw new Exception("assignee can not be empty");
        }
        if(reviewer.equals("")) {
            throw new Exception("reviewer can not be empty");
        }

        if(date.equals("")) {
            throw new Exception("Datetime can not be empty");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.parse(date);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }

        this.validateFromTo(planFrom, planTo);

        //generate new id
        //using TaskType
        //listTask.add(new Task());

    }
}
