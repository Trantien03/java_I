package com.shape;

import com.staff.Director;
import com.staff.Employee;
import com.staff.Manager;
import com.staff.Staff;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("class2");

        Shape shape[] =  new Shape[3];

        shape[0] = new Triangle();
        shape[1] = new Rectangle();
        shape[2] = new Circle();


        shape[0].getArea();
        shape[1].getArea();
        shape[2].getArea();

        }
}
