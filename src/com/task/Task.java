package com.task;

import java.util.Date;

/**
 *
 * @author NghiaNV1
 * @version 1.0
 */
public class Task {
    /**
     * id of task
     */
    private int id;
    /**
     * name of task, assignee task to person, reviewer task of person
     */
    private String requirementName, assignee, reviewer;
    /**
     * Task Type
     */
    private TaskType taskTypeID;
    /**
     * plan date of task
     */
    private Date date;
    /**
     * Time plan
     */
    private float planFrom, planTo;

    /**
     * init task
     *
     * @param id
     *            id of task
     * @param requirementName
     *            name of task
     * @param assignee
     *            assign to person
     * @param reviewer
     *            reviewer task of person
     * @param taskTypeID
     *            task type
     * @param date
     *            date plan task
     * @param planFrom
     *            time plan
     * @param planTo
     *            time plan
     */
    public Task(int id, String requirementName, String assignee,
                String reviewer, TaskType taskTypeID, Date date, float planFrom,
                float planTo) {
        super();
        this.id = id;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.taskTypeID = taskTypeID;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
    }

    /**
     * getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter
     *
     * @param id
     *            id of task
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter
     *
     * @return Name
     */
    public String getRequirementName() {
        return requirementName;
    }

    /**
     * setter
     *
     * @param requirementName
     *            name of task
     */
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    /**
     * getter
     *
     * @return Assignee
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * setter
     *
     * @param assignee
     *            assignee of task
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * getter
     *
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * setter
     *
     * @param reviewer
     *            reviewer of task
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * getter
     *
     * @return type of task
     */
    public TaskType getTaskTypeID() {
        return taskTypeID;
    }

    /**
     * setter
     *
     * @param taskTypeID
     *            Task Type of task
     */
    public void setTaskTypeID(TaskType taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    /**
     * getter
     *
     * @return date of task
     */
    public Date getDate() {
        return date;
    }

    /**
     * setter
     *
     * @param date
     *            date of task
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * getter
     *
     * @return time of task
     */
    public float getPlanFrom() {
        return planFrom;
    }

    /**
     * setter
     *
     * @param planFrom
     *            time of task
     */
    public void setPlanFrom(float planFrom) {
        this.planFrom = planFrom;
    }

    /**
     * getter
     *
     * @return time of task
     */
    public float getPlanTo() {
        return planTo;
    }

    /**
     * setter
     *
     * @param planTo
     *            time of task
     */
    public void setPlanTo(float planTo) {
        this.planTo = planTo;
    }

}

