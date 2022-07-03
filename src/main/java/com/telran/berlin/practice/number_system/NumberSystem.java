package com.telran.berlin.practice.number_system;

public class NumberSystem {
    public static void main(String[] args) {
        int a = 0b100011010;  // binary format prefix 0b......(0-1)
        int b = 01234;  // okto format prefix 0 ..... (0-7)
        int c = 4569;  //   decimal format (0-9)
        int d = 0xeeeeee;  // hex format prefix 0x (0-9 A-F)

        String s = "0x1410efa";

//        Integer.toHexString(s);
        String s1 = Integer.toHexString(c);

        String s2 = Integer.toHexString(d);

        System.out.println("Binary: " + a);
        System.out.println("Okto: " + b);
        System.out.println("Decimal: " + c);
        System.out.println("Hex: " + d);
//        System.out.println(s);

        System.out.println("int to hex " + s1);
        System.out.println("int to hex " + s2);
        System.out.println("int to hex " + Integer.toHexString(0b11));
        System.out.println("int to hex " + Integer.toHexString(b));
        System.out.println(0b1000 + 7);

    }
}
