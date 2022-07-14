package com.telran.berlin.practice.string;

import java.util.Scanner;

public class ScanString {
    public static void main(String[] args) {
        //Ввести два слова и проверить что там четное количество букв
        Scanner sc = new Scanner(System.in);

        System.out.print("First word: ");
        String s1 = sc.nextLine();
        while ((s1.length()%2) != 0) {
            System.out.print("Word length must be even. Try again: ");
            s1 = sc.nextLine();
        }

        System.out.print("Second word: ");
        String s2 = sc.nextLine();
        while ((s2.length()%2) != 0) {
            System.out.print("Word length must be even. Try again: ");
            s2= sc.nextLine();
        }

        System.out.println(connectStrings(s1, s2));

    }
    //Первое слово половина плюс второе слово половина
    public static String connectStrings(String a, String b) {
            return a.substring(0, a.length()/2) + b.substring(b.length()/2);
    }

}
