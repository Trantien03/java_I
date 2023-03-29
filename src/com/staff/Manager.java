package com.staff;

import java.util.Scanner;

public class Manager extends  Staff {
    String department;

    @Override
    public int getBonus() {
        return 3 * this.salary;
    }

    @Override
    public void inputData() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter department: ");
        this.department = input.nextLine();
    }

    @Override
    public void display() {
        System.out.println("This is an Manager");
        System.out.println("Department " + this.department);
    }
}
