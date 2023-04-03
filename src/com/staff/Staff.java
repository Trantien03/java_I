package com.staff;

import java.util.Scanner;

public abstract class Staff {
    String name;
    String email;
    int salary;

    //set Salary
    public void setSalary(int sal)
    {
        this.salary = sal;
    }

    public abstract int getBonus();

    public abstract void inputData(); // abstract method

    public abstract void display();
}

