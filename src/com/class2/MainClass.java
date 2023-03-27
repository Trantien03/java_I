package com.class2;

import java.util.Scanner;

public class MainClass {

    public static int getSum(int num) {
        int sum = 0;
        do {
            sum += num % 10;
            num = num / 10;
            System.out.println("Sum = " + sum);
            System.out.println("number = " + num);

        } while(num > 0);

        return sum;
    }

    public static void main(String[] args) {

        String answer = "yes";

        do {
            System.out.print("Enter number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            int total = getSum( number );
            System.out.println("Total number = " + total);

            System.out.print("Continue? ");
            input = new Scanner(System.in);
            answer = input.nextLine();

        } while(answer.equals(""));

    }
}
