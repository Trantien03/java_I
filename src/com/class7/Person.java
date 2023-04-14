package com.class7;

class Manager extends Person {

    @Override // annotation
    public int getBonus(String role) {
        return 3;
    }

    @Deprecated
    public void display() {
        System.out.println("This is Manager");
    }

    public void newDisplay() {
        System.out.println("This is Manager");
    }

}

public class Person {
    public int getBonus(String role) {
        if(role.equals("director")) {
            return 5;
        } else if(role.equals("manager")) {
            return 3;
        } else if(role.equals("employee")) {
            return 2;
        }
        return 0;
    }

}
