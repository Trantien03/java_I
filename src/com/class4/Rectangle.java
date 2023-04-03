package com.class4;

import java.util.Scanner;

public class Rectangle extends Shape {

    float width;
    float length;

    Rectangle() {

    }

    Rectangle( float l , float w ) {
        this.length = l;
        this.width = w;
    }

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length : " );
        this.length = input.nextFloat();

        System.out.print("Enter width : " );
        this.width = input.nextFloat();

        System.out.println("Set length = " + this.length);
        System.out.println("Set width = " + this.width);
    }

    @Override
    public float getArea() {
        return this.length * this.width;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("ID = " + this.id + "This is a Rectangle width = " + this.width + ", Lengh = " + this.length);
    }

    @Override
    public void updateData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length : " );
        this.length = input.nextFloat();

        System.out.print("Enter width : " );
        this.width = input.nextFloat();

        System.out.println("Update length = " + this.length);
        System.out.println("Update width = " + this.width);
    }

//    @Override
//    public int compareTo(Object o) {
//        Rectangle rec = (Rectangle) o;
//        return (int) (this.width - rec.width);
//    }
}
