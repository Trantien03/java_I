package com.class5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {

    private static List<Person> list = new ArrayList<Person>();
    private static Person person;
    public void runMainMenu() {

        Scanner scanner = new Scanner(System.in);

        mainMenuLoop: while (true) {
            System.out.println();
            System.out.println("==> Welcome to company management <==");
            System.out.println("1. Create new personnel");
            System.out.println("2. Show all personnel");
            System.out.println("3. Search for personnel by id");
            System.out.println("4. Update personnel");
            System.out.println("5. View personnel salary");
            System.out.println("6. Update salary for staff");
            System.out.print("Enter your selection (1 - 6): ");
            int selectedMenu = Integer.parseInt(scanner.nextLine());
            switch (selectedMenu) {
                case 1 -> {
                    createNewPerson();
                }
                case 2 -> {
                    displayAllPeople();
                }
                case 3 -> {
                    findPerson();
                }
                case 4 -> {
                    updatePerson();
                }
                case 5 -> {
                    checkSalary();
                }
                case 6 -> {
                    updateSalary();
                }
                case 7 -> {
                    break mainMenuLoop;
                }
            }
        }
    }

    public void createNewPerson() {
        Scanner scanner = new Scanner(System.in);
        createNewPersonLoop: while (true) {
            System.out.println();
            System.out.println("==> Create new personnel <==");
            System.out.println("1. Director");
            System.out.println("2. Manager");
            System.out.println("3. Employee");
            System.out.print("Which staff do you want to choose? (1 - 3): ");
            int selectedMenu = Integer.parseInt(scanner.nextLine());
            switch (selectedMenu) {
                case 1 -> {
                    person = new Director();
                }
                case 2 -> {
                    person = new Manager();
                }
                case 3 -> {
                    person = new Employee();
                }
                case 4 -> {
                    break createNewPersonLoop;
                }
            }
            person.input();
            list.add(person);
        }

    }

    public void displayAllPeople() {
        System.out.println("Showing " + list.size() + " Personnel...");
        for (Person person : list) {
            person.display();
        }
    }

    public void findPerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the id of the person you want to search for: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found a result: ");
                result.display();
            } else {
                System.out.println("No result is found!");
            }
        }

    }

    public Person findPersonById(int id) {
        for (Person person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the id of the person you want to search for: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found a result ");
                result.display();
                result.updatePerson();
            } else {
                System.out.println("No result is found!");
            }
        }
    }

    public void checkSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the id of the person you want to search for: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found a result: ");
                result.display();
            } else {
                System.out.println("No result is found!");
            }
        }
    }

    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop: while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the id of the person you want to search for: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Person result = findPersonById(id);
            if (result != null) {
                System.out.print("Found a result: ");
                result.display();
                result.updataSalary();
            } else {
                System.out.println("No result is found!");
            }
        }
    }
}
