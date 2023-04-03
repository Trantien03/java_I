package com.class4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManagement {
    List<Shape> list;
    int currentId = 0;

    public ShapeManagement() {
        list = new ArrayList<Shape>();
        Shape c = new Circle(10);
        c.setId(++currentId);
        list.add(c);

        Shape t = new Triangle(3, 4, 5);
        t.setId( ++currentId );
        list.add( t );

        Shape r = new Rectangle(4, 5);
        r.setId(++currentId);
        list.add( r );
    }

    public void addNewShape() {
        System.out.println("1. Create a Triangle ");
        System.out.println("2. Create a Circle");
        System.out.println("3. Create a Rectangle ");
        System.out.print("Please choose: ");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        Shape newShape = null;

        switch (choose) {
            case 1: {
                newShape = new Triangle();
            }
            break;
            case 2: {
                newShape = new Circle();
            }
            break;
            case 3: {
                newShape = new Rectangle();
            }
            break;
        }

        newShape.setId(++currentId);
        newShape.inputData();
        list.add( newShape );
    }

    public void dislayAll(){
        for (Shape item : list) {
            //display method of Shape class
            item.display();
        }
    }

    Shape findShapeById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Shape item : list) {
            if(findId == item.getId()) {
                item.display();
                //return item that has id
                return item;
            }
        }

        return null;
    }

    public void updateShape() {
        Shape findShape = this.findShapeById();
        if(findShape != null) {
            findShape.updateData();
        } else {
            System.out.println("Not found");
        }
    }


}
