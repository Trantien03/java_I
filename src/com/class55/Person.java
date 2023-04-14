package com.class55;

public class Person {
    private int id;
    private String name;
    private double salary;
    private double bonus;

    public Person(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
}

