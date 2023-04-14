package com.class5;

import java.util.Scanner;

public class Director extends Person{
    private String role;
    public Director(){
        super();
    }
    public String getRole(){
        return role;
    }
    @Override
     public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter bonus level: ");
        bonus = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter location: ");
        role = scanner.nextLine();
        System.out.print("Successfully created: ");
        display();
    }
    @Override
    public void display() {
        System.out.printf("Director [id = %d, name = %s, basic salary = %.5f, bonuses = %.5f, location = %s", getId(), getName(), getSalary(), getBonus(), getRole());
    }
    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update location: ");
        role = scanner.nextLine();
        System.out.print("Create success: ");
        display();
    }
}
