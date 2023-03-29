package com.shape;

import com.staff.Staff;

import java.util.Scanner;

public class Rectangle extends Shape {
    float a, b;

    @Override
    public void inputData() {
        System.out.println("Dang khoi tao hinh chu nhat.....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap chieu rong: ");
        b = Integer.parseInt(scanner.nextLine());
    }

    public float getArea() {
        double area = a * b;
        System.out.printf("Dien tich hinh chu nhat = %.1f%n", area);
        return 0;
    }
}

