package com.class5;

import java.util.Scanner;

public class Manager extends Person {
    private String department;

    public Manager() {
        super();
    }

    public String getDepartment(){
        return department;
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
        department = scanner.nextLine();
        System.out.print("Successfully created: ");
        display();
    }

    @Override
    public void display() {
        System.out.printf("Manager [id = %d, name = %s, basic salary = %.5f, bonuses = %.5f, location = %s", getId(), getName(), getSalary(), getBonus(), getDepartment());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update location: ");
        department = scanner.nextLine();
        System.out.print("Create success: ");

    }
}

