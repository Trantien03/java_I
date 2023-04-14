package com.class4;

import java.util.Scanner;

public class Triangle extends Shape {
    float a;
    float b;
    float c;

    public Triangle() {
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getArea() {
        float p = (a+b+c) / 2;
        return (float) Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public boolean inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : " );
        this.a = input.nextFloat();

        System.out.print("Enter b : " );
        this.b = input.nextFloat();

        System.out.print("Enter b : " );
        this.c = input.nextFloat();

        return true;
    }

    @Override
    public void display() {
        System.out.println("ID = " + this.id + "This is a Triangle");
    }

    @Override
    public void updateData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : " );
        this.a = input.nextFloat();

        System.out.print("Enter b : " );
        this.b = input.nextFloat();

        System.out.print("Enter b : " );
        this.c = input.nextFloat();

        System.out.println("Updated Triangle");
    }
}
