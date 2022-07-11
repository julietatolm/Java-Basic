package com.telran.berlin.homework.casting;

import java.util.Scanner;


public class Cast {
    public static void main(String[] args) {


//      1. Выведите на экран строку "3 cups", полученную из числа 3.9 и строки "cups", используя преобразования типов, и конкатенацию.
        double a = 3.9;
        String s = " cups";
        int b = (int) a;

        System.out.println(b + s);

//      2. Выведите на экран строку "4 cups", полученную из числа 3.9 и строки "cups", используя округление, и конкатенацию.
        int c = (int) Math.round(a);
        System.out.println(c + s);

//      3. Используя переменные только типа данных char вывести в консоль "Hello <ваше имя>" (в треугольных скобках должно быть ваше имя)

        System.out.print((char) 72);
        System.out.print((char) 101);
        System.out.print((char) 108);
        System.out.print((char) 108);
        System.out.print((char) 111);
        System.out.print((char) 32);
        System.out.print((char) 89);
        System.out.print((char) 117);
        System.out.print((char) 108);
        System.out.print((char) 105);
        System.out.println((char) 97);

//      4. Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки, и брала только те, в которых ровно M орешков.
//        Также известно, что для пропитания зимой ей необходимо не менее K орешков. Определите, хватит ли на зиму орешков белочке.
//                Используйте Scanner для ввода N, M, K. Используйте if-else для вывода: если хватит на зиму, то выведите в консоль YES, иначе NO.
//                пример: N = 3, M = 2, K = 1 - вывод YES; N = 4, M = 5, K = 21 - вывод NO;

        Scanner sc = new Scanner(System.in);
//        System.out.println("Сколько шишек собрала белочка?");
        System.out.println("Skol'ko shishek sobrala belka?");
        int n = sc.nextInt();

//        System.out.println("Сколько орешков было в каждой шишке?");
        System.out.println("Skol'ko oreshek?");
        int m = sc.nextInt();

        System.out.println("Skol'ko nado?");
//        System.out.println("Сколько орешков ей надо зимой?");
        int k = sc.nextInt();

        if (n*m >= k) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
//
//        5. Напишите метод, который принимает в качестве параметра любую строку. Выведите в консоль первый символ из этой строки.
//        Используйте <строка из параметра>.charAt(0);
//        пример: str = "Aleks" - передал в метод str, в методе используя str.charAt(0); распечатал в консоль A

        sc.nextLine();
        System.out.println("Napisat' stroku: ");
        String s1 = sc.nextLine();
        str(s1);
    }

    public static void str(String s) {
        char c = s.charAt(0);
        System.out.println(c);
    }
}
