package com.staff;

public class Main {
    public static void main(String[] args) {
        System.out.println("class2");

        Staff staff[] =  new Staff[3];

        staff[0] = new Director();
        staff[1] = new Manager();
        staff[2] = new Employee();

        //Director
        staff[0].setSalary(2000);
        //Manager
        staff[1].setSalary(1500);
        //Employee
        staff[2].setSalary(1000);

        int total = 0;
        for (Staff item : staff) {
            item.display();
            System.out.println("Bonus " + item.getBonus());
            total += item.getBonus();
        }

        System.out.println("Company bonus: " + total);

    }
}