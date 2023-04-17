package com.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
/**
 *
 * @author NghiaNV1
 * @version 1.0
 */
public class ManagementTask {
    /**
     * Times limit
     */
    private static final int TIME_FROM = 8, TIME_TO = 17;
    /**
     * Times limit
     */
    private static final float TIME_BREAK = 0.5f;
    /**
     * message for exception DIGIT ID
     */
    public static final String ID_DIGIT = "ID is digit";
    /**
     * message for exception Task type doesn't exist
     */
    public static final String ID_TYPE_NOT_EXIST = "ID TaskType doesn't exist";
    /**
     * message for exception Task doesn't exist
     */
    public static final String ID_TASK_NOT_EXIST = "ID Task doesn't exist";
    /**
     * message for exception Task type name Invalid
     */
    public static final String TYPE_NAME_NOT_NULL_EMPTY
            = "TaskType name is invalid";
    /**
     * message for exception Task name Invalid
     */
    public static final String REQUIREMENT_NAME_NOT_NULL_EMPTY
            = "Requirement name is invalid";
    /**
     * message for exception Task type using can't delete
     */
    public static final String TASK_TYPE_USING = "TaskType is using";
    /**
     * message for exception date
     */
    public static final String DATE_INVALID = "Date is invalid";
    /**
     * message for exception plan invalid
     */
    public static final String PLANFROM_INVALID = "PlanFrom is invalid";
    /**
     * message for exception plan invalid
     */
    public static final String PLANTO_INVALID = "PlanTo is invalid";
    /**
     * message for exception plan from > plan to
     */
    public static final String PLANTO_LESS_THAN_PLANFROM
            = "PlanTo is greater than PlanFrom";
    /**
     * contain data task
     */
    private List<Task> dataTasks = new ArrayList<Task>();
    /**
     * contain data task type
     */
    private List<TaskType> dataTypeTasks = new ArrayList<TaskType>();
    /**
     * contain time is valid
     */
    private List<Float> times = new ArrayList<Float>();

    /**
     * init times value 8.0 -> 17.5
     */
    public ManagementTask() {
        for (int i = TIME_FROM; i <= TIME_TO; i++) {
            times.add((float) i);
        }
        List<Float> drafts = new ArrayList<Float>();
        for (Float time : times) {
            float timeDraft = (float) (time.floatValue() + TIME_BREAK);
            drafts.add(timeDraft);
        }
        times.addAll(drafts);
        Collections.sort(times);
    }

    /**
     * add type task
     *
     * @param name
     *            task type name
     * @return id task
     * @throws Exception
     *             type name invalid
     */
    public int addTaskType(String name) throws Exception {
        if (name == null || "".equals(name)) {
            throw new Exception(TYPE_NAME_NOT_NULL_EMPTY);
        }
        int id = 1;
        if (dataTypeTasks.size() > 0) {
            id = dataTypeTasks.get(dataTypeTasks.size() - 1).getId() + 1;
        }
        dataTypeTasks.add(new TaskType(id, name));
        return id;
    }

    /**
     * delete task type
     *
     * @param id
     *            id task type
     * @throws Exception
     *             id invalid(not a number, not exist)
     */
    public void deleteTaskType(String id) throws Exception {
        int code = 0;
        try {
            code = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new Exception(ID_DIGIT);
        } catch (NullPointerException e) {
            throw new Exception(ID_DIGIT);
        }
        int i = 0;
        boolean canDelete = false;
        for (i = 0; i < dataTypeTasks.size(); i++) {
            if (code == dataTypeTasks.get(i).getId()) {
                canDelete = true;
                break;
            }
        }
        if (canDelete == false) {
            throw new Exception(ID_TYPE_NOT_EXIST);
        }
        for (Task task : dataTasks) {
            if (task.getTaskTypeID().getId() == code) {
                throw new Exception(TASK_TYPE_USING);
            }
        }
        dataTypeTasks.remove(i);

    }

    /**
     * check date
     *
     * @param inDate
     *            String date
     * @return date
     * @throws Exception
     *             date invalid
     */
    public Date getDate(String inDate) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        if (inDate == null || "".equals(inDate)) {
            return new Date();
        }
        try {
            Date date = dateFormat.parse(inDate.trim());
            return date;
        } catch (ParseException pe) {
            throw new Exception(DATE_INVALID);
        }
    }

    /**
     * check time
     *
     * @param from
     *            time from
     * @param to
     *            time to
     * @throws Exception of time
     */
    public void validateFromTo(String from, String to) throws Exception {
        Float planFrom = 0f;
        Float planTo = 0f;
        try {
            planFrom = Float.parseFloat(from);
        } catch (NumberFormatException e) {
            throw new Exception(PLANFROM_INVALID);
        } catch (NullPointerException e) {
            throw new Exception(PLANFROM_INVALID);
        }
        try {
            planTo = Float.parseFloat(to);
        } catch (NumberFormatException e) {
            throw new Exception(PLANTO_INVALID);
        } catch (NullPointerException e) {
            throw new Exception(PLANTO_INVALID);
        }
        if (!times.contains(planFrom)) {
            throw new Exception(PLANFROM_INVALID);
        }
        if (!times.contains(planTo)) {
            throw new Exception(PLANTO_INVALID);
        }
        if (planFrom >= planTo) {
            throw new Exception(PLANTO_LESS_THAN_PLANFROM);
        }
    }

    /**
     * add task
     *
     * @param requirementName
     *            name
     * @param assignee
     *            assign to person
     * @param reviewer
     *            person review
     * @param taskTypeID
     *            id of task type
     * @param date
     *            of task
     * @param planFrom
     *            time from
     * @param planTo
     *            time to
     * @return id task
     * @throws Exception
     *             of task
     */
    public int addTask(String requirementName, String assignee,
                       String reviewer, String taskTypeID, String date, String planFrom,
                       String planTo) throws Exception {
        if (requirementName == null || "".equals(requirementName)) {
            throw new Exception(REQUIREMENT_NAME_NOT_NULL_EMPTY);
        }
        int i = 0;
        boolean canDelete = false;
        for (i = 0; i < dataTypeTasks.size(); i++) {
            if (Integer.parseInt(taskTypeID) == dataTypeTasks.get(i).getId()) {
                canDelete = true;
                break;
            }
        }
        if (canDelete == false) {
            throw new Exception(ID_TYPE_NOT_EXIST);
        }
        validateFromTo(planFrom, planTo);
        int id = 1;
        if (dataTasks.size() > 0) {
            id = dataTasks.get(dataTasks.size() - 1).getId() + 1;
        }
        dataTasks.add(new Task(id, requirementName, assignee, reviewer,
                dataTypeTasks.get(i), getDate(date),
                Float.parseFloat(planFrom), Float.parseFloat(planTo)));
        return id;
    }

    /**
     * delete task
     *
     * @param id
     *            task
     * @throws Exception
     *             task id(not exist, not a number)
     */
    public void deleteTask(String id) throws Exception {
        int code = 0;
        try {
            code = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new Exception(ID_DIGIT);
        }
        boolean canDelete = false;
        int i = 0;
        for (i = 0; i < dataTasks.size(); i++) {
            if (code == dataTasks.get(i).getId()) {
                canDelete = true;
                break;
            }
        }
        if (canDelete == false) {
            throw new Exception(ID_TASK_NOT_EXIST);
        }
        dataTasks.remove(i);
    }

    /**
     * get data of task
     *
     * @return list task
     */
    public List<Task> getDataTasks() {
        return dataTasks;
    }

    /**
     * get data of type task
     *
     * @return list task type
     */
    public List<TaskType> getDataTypeTasks() {
        return dataTypeTasks;
    }

}

