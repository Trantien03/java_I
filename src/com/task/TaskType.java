package com.task;

public class TaskType {
    /**
     * id of type
     */
    private int id;
    /**
     * name of type
     */
    private String name;
    /**
     * init type
     * @param id id of type
     * @param name of type
     */
    public TaskType(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    /**
     * getter
     * @return id of type
     */
    public int getId() {
        return id;
    }
    /**
     * setter
     * @param id of type
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * getter
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * setter
     * @param name of type
     */
    public void setName(String name) {
        this.name = name;
    }

}

