package com.class4;

import java.util.Scanner;

public class Circle extends Shape implements IColor {

    float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public boolean inputData() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter radius : " );
            String sRadius = input.nextLine();

            this.radius = Float.parseFloat(sRadius);

            if(this.radius < 0) {
                return false;
            }

            System.out.println("Set radius = " + this.radius);

            return true;
        } catch(Exception e) {
            System.out.println("");
        }

        return false;
    }

    @Override
    public void display() {
        System.out.println("ID = " + this.id + " This is a Circle with radius = " + this.radius);
    }

    @Override
    public void updateData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius to update : " );
        this.radius = input.nextFloat();
        System.out.println("Set radius = " + this.radius);
    }

    @Override
    public void fillColor() {
        System.out.println("Fill color to Circle");
    }
}
