package com.class5;

import java.util.Scanner;

public abstract class Person{
    private static int count = 0;
    int id;
    String name;
    double bonus;
    double salary;

    public Person(){
        this.id = ++ count;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBonus(){
        return bonus;
    }
    public double getSalary(){
        return bonus * salary + salary;
    }
    public abstract void display();
    public abstract void input();
    public abstract void updatePerson();
    public void updataSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("New salary update:");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Update new bonus level:");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.printf("Updated: New base salary = %.5f ,New bonus level = %.5f ", salary , bonus);
    }

}

