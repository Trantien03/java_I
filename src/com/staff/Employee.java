package com.staff;

import java.util.Scanner;

public class Employee extends Staff {
    String skill;

    @Override
    public int getBonus() {
        return 2 * this.salary;
    }

    @Override
    public void inputData() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter skill: ");
        this.skill = input.nextLine();
    }

    @Override
    public void display() {
        System.out.println("This is Employee");
        System.out.println("Skill " + this.skill);
    }
}