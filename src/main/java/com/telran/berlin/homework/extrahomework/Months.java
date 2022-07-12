package com.telran.berlin.homework.extrahomework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Input month's number: ");
        int a = sc.nextInt();
        if (a == 1 || a == 2 || a == 12) {
            System.out.println("Winter");
        }
        else if (a > 2 && a < 6) {
            System.out.println("Spring");
        }
        else if (a > 5 && a < 9) {
            System.out.println("Summer");
        }
        else if (a > 8 && a < 12) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Error");
        }

    }
}
