package com.class5;

import java.util.Scanner;

public class Employee extends Person {
    private String skill;

    public Employee() {
        super();
    }

    public String getSkill() {
        return skill;
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
        skill = scanner.nextLine();
        System.out.print("Successfully created: ");
        display();
    }

    @Override
    public void display() {
        System.out.printf("Employee [id = %d, name = %s, basic salary = %.5f, bonuses = %.5f, location = %s", getId(), getName(), getSalary(), getBonus(), getSkill());
    }

    @Override
    public void updatePerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update location: ");
        skill = scanner.nextLine();
        System.out.print("Create success: ");

    }
}


