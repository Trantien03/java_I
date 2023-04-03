package com.class4;

public abstract class Shape {
    String color;
    int id;

    public abstract float getArea();

    public abstract float getPerimeter();

    public abstract void inputData();

    public abstract void display();

    public abstract void updateData();

    // common method of all Classes
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
