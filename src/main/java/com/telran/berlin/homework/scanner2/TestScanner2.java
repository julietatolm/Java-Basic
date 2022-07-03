package com.telran.berlin.homework.scanner2;

import java.util.Scanner;

public class TestScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();


        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("number1 = " + num1 + " number2 = " + num2);

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));



    }




}
