package com.class7.task;

import java.util.Date;

public class Task {
    private int id;
    /**
     * name of task, assignee task to person, reviewer task of person
     */
    private String requirementName, assignee, reviewer;
    /**
     * Task Type
     */
    //private TaskType taskTypeID;

    public Task(int id, String requirementName, String assignee, String reviewer, Date date, float planFrom, float planTo) {
        this.id = id;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
    }

    /**
     * plan date of task
     */
    private Date date;
    /**
     * Time plan
     */
    private float planFrom, planTo;
}
