package com.shape;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("The area of the triangle ");
        System.out.println("The area of the rectangle ");
        System.out.println("The area of the circle ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vui long chon menu (1 - 3): ");
            int selectedMenu = Integer.parseInt(scanner.nextLine());

            switch (selectedMenu) {
                case 1 -> {
                    Triangle triangle = new Triangle();
                    triangle.inputData();
                    triangle.getArea();
                }
                case 2 -> {
                    Rectangle rectangle = new Rectangle();
                    rectangle.inputData();
                    rectangle.getArea();
                }
                case 3 -> {
                    Circle circle = new Circle();
                    circle.inputData();
                    circle.getArea();
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
