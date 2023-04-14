package com.class4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class MainClass {

    //Overload method
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(float a, float b) {
        return (int)(a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {

        ShapeManagement shapeManagement = new ShapeManagement();

        do {
            System.out.println("1. Create a Shape");
            System.out.println("2. Display all");
            System.out.println("3. Find shape by id");
            System.out.println("4. Update shape");
            System.out.print("5. Exit");

            System.out.print("Choose menu: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1: {
                    shapeManagement.addNewShape();
                }
                break;
                case 2: {
                    shapeManagement.dislayAll();
                }
                break;
                case 3: {
                    Shape s = shapeManagement.findShapeById();
                    if( s != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 4: {
                    shapeManagement.updateShape();
                }
                break;
                case 5: {
                    System.out.println("Close application");
                    return;
                }
            }

        } while(true);



//        List<Rectangle> list = new ArrayList<Rectangle>();
//        list.add(new Rectangle(3, 4));
//        list.add(new Rectangle(4, 5));
//        list.add(new Rectangle(2, 3));
//
//        list.sort(new CompareRectangle());
//
//        for(Rectangle item : list) {
//            item.display();
//        }


        //Generic
//        List<Shape> list = new ArrayList<Shape>();
//        list.add(new Rectangle(4, 5));
//        list.add(new Triangle(3, 4, 5));
//        list.add(new Circle(5));
//
//        float total = 0;
//        for(Shape item : list ) {
//            total += item.getArea();
//            System.out.println("Area: " + item.getArea());
//        }
//
//        System.out.println("Total area: " + total);
    }
}
