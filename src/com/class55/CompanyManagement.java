package com.class55;

import java.util.ArrayList;

public class CompanyManagement {

    private ArrayList<Person> employees = new ArrayList<>();

    // Add new person to the list
    public void addNewPerson(Person p) {
        employees.add(p);
    }

    // Display all employees in the list
    public void displayAll() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i+1) + ". " + employees.get(i).getName() + " - Salary: " + employees.get(i).getSalary() + " - Bonus: " + employees.get(i).getBonus());
        }
    }

    // Find person by ID
    public Person findPersonById(int id) {
        for (Person p : employees) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Update person information
    public void updatePerson(Person p) {
        int index = employees.indexOf(p);
        if (index >= 0) {
            employees.set(index, p);
        }
    }

    // Get total bonus of the company
    public double getTotalBonusOfCompany() {
        double totalBonus = 0;
        for (Person p : employees) {
            totalBonus += p.getBonus();
        }
        return totalBonus;
    }

    // Increase salary for all employees
    public void updateNewSalary(double salaryIncrease) {
        for (Person p : employees) {
            double newSalary = p.getSalary() + salaryIncrease;
            p.setSalary(newSalary);
        }
    }
}

