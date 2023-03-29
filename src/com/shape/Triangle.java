package com.shape;


import com.staff.Staff;

import java.util.Scanner;

    class Triangle extends Shape {

        private float a,b,c;


        public void inputData() {
            System.out.println("Dang khoi tao hinh tam giac.....");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap do dai canh a: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap do dai canh b: ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap do dai canh c: ");
            c = Integer.parseInt(scanner.nextLine());
        }

        public float getArea() {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Dien tich hinh tam giac = %.1f%n", area);
            return 0;
        }
    }