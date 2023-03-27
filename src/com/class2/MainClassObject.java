package com.class2;

import com.class2.Student;

public class MainClassObject {
    public static void main(String[] args) {
        //Student stu = new Student("A12345", "Tuan", 21);
        Student newStudent = new Student();
        newStudent.inputData();
        newStudent.display();

        //deposit money to Student
        newStudent.deposit();
    }
}

