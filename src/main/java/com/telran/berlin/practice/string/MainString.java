package com.telran.berlin.practice.string;

import com.telran.berlin.homework.two.game.hero.Elf;

public class MainString {
    public static void main(String[] args) {

        double d = 4.5;
        Double f = 4.5;

        int n = 3;
        Integer num = 3;

        test(n);

        String name = null;
        System.out.println(name);
        name = "Yulia";

        Elf elf = new Elf();
        
    }

    public static void test(int l) {
        int l2 = l;
        System.out.println(l2);
    }

    public static void test(float l) {
        System.out.println(l);
    }
}
