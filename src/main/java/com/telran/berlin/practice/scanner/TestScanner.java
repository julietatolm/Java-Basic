package com.telran.berlin.practice.scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = sc.nextInt();
//        System.out.println("Thank you! You entered the number: " + number);
//
//        System.out.print("Enter the number: ");
//        int number2 = sc.nextInt();
//        System.out.println("Sum: " + (number+number2));

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);

        int age = 0;
        System.out.print("Enter your age: ");
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("Sorry, but this is wrong format age!");
        }

        sc.nextLine();

        System.out.print("Enter your phone  number: ");
        long phone = 0;
        if (sc.hasNextInt()) {
            phone = sc.nextInt();
        } else {
            System.out.println("Sorry, but this is wrong format phone!");
        }

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Phone = " + phone);

        sc.close();
    }
}
