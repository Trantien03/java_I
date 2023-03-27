package com.staff;

import java.util.Scanner;

public class Person {
    protected String name;
    public String email;
    private int salary;
    public int getSalary(){
        return salary;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        name = scanner.nextLine();

        System.out.print("Input email: ");
        email = scanner.nextLine();

        System.out.print("Input salary: ");
        salary = Integer.parseInt(scanner.nextLine());
    }
    public void display() {
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);
        System.out.println("Salary " + this.salary);
    }
    class Director extends Person{
    private String roll;

    @Override

    public void input(){
        Scanner newScanner = new Scanner(System.in);
        super.display();
        System.out.print("Input roll: ");
        roll = newScanner.nextLine();

    }
    @Override
    public void display() {
        super.display();
        System.out.printf(",roll = %s", roll);
    }
    }
    class Manager extends Person{
        private String department;
        @Override
        public void input(){
            Scanner newScanner = new Scanner(System.in);
            super.display();
            System.out.print("Input department: ");
            department = newScanner.nextLine();

        }
        @Override
        public void display() {
            super.display();
            System.out.printf(",department = %s", department);
        }
    }
    class Employee extends Person{
        private String skill;
        @Override
        public void input(){
            Scanner newScanner = new Scanner(System.in);
            super.display();
            System.out.print("Input skill: ");
            skill = newScanner.nextLine();

        }
        @Override
        public void display() {
            super.display();
            System.out.printf(",department = %s", skill);
        }

    }
}

