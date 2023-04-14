package com.class55;

public class Main {
    public static void main(String[] args) {
        CompanyManagement company = new CompanyManagement();

        // Thêm một số nhân viên
        company.addNewPerson(new Person(1, "Tuan", 5000, 1000));
        company.addNewPerson(new Person(2, "Son", 6000, 1200));
        company.addNewPerson(new Person(3, "Nam", 4000, 800));
        company.addNewPerson(new Person(4, "Tien", 7000, 1300));

        // Hiển thị tất cả nhân viên
        System.out.println("List of all employees:");
        company.displayAll();

        // Tìm nhân viên theo ID
        int idToFind = 1;
        Person foundPerson = company.findPersonById(idToFind);
        if (foundPerson != null) {
            System.out.println("\nFound employee with ID " + idToFind + ":");
            System.out.println(foundPerson.getName() + " - Salary: " + foundPerson.getSalary() + " - Bonus: " + foundPerson.getBonus());
        } else {
            System.out.println("\nEmployee with ID " + idToFind + " not found.");
        }

        // Cập nhật thông tin của một nhân viên
        Person personToUpdate = company.findPersonById(4);
        personToUpdate.setName("Tien");
        personToUpdate.setSalary(7000);
        personToUpdate.setBonus(1300);
        company.updatePerson(personToUpdate);
        System.out.println("\nUpdated employee with ID 3:");
        System.out.println(personToUpdate.getName() + " - Salary: " + personToUpdate.getSalary() + " - Bonus: " + personToUpdate.getBonus());

        // Nhận tổng tiền thưởng của công ty
        System.out.println("\nTotal bonus of the company: " + company.getTotalBonusOfCompany());

        // Tăng lương cho tất cả nhân viên
        double salaryIncrease = 1200;
        company.updateNewSalary(salaryIncrease);
        System.out.println("\nIncreased salary for all employees by " + salaryIncrease);
        company.displayAll();
    }

}
