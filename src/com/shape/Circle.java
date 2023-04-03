package com.shape;

import com.staff.Staff;

import java.util.Scanner;

 public class Circle extends Shape {

    private float radius;

    public void inputData() {
        System.out.println("Dang khoi tao hinh tron.....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = Integer.parseInt(scanner.nextLine());
    }
    public void display(){
        System.out.println("Ban Kinh:" + this.radius);

    }

    public float getArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Dien tich hinh tron = %.1f%n", area);
        return 0;
    }
}