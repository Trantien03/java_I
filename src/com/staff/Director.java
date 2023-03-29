package com.staff;

import java.util.Scanner;

public class Director extends Staff {
    String role;

    @Override
    public int getBonus() {
        return 5 * this.salary;
    }

    @Override
    public void inputData() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter role: ");
        this.role = input.nextLine();
    }

    @Override
    public void display() {
        System.out.println("This is an Director");
        System.out.println("Role " + this.role);
    }


}