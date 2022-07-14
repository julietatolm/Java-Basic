package com.telran.berlin.homework.string;

import org.w3c.dom.ls.LSOutput;

public class StringHomework {
    public static void main(String[] args) {
        //1 Создайте строку через new - I study Basic Java!
        String s = new String("I study Basic Java!");

        //2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        //3 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.print("Task 2 and 3 create method and print last symbol: ");
        lastSymbol(s);

        //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        if(s.contains("Java")) {
            System.out.println("Task 4 contains Java: " + true);
        }
        else {
            System.out.println("Task 4 contains Java: " + false);
        }

        //5 Заменить все символы “а” на “о”.
        String task5 = s.replace('a', 'o');
        System.out.println("Task 5 replace a -> o : " + task5);

        //6 Преобразуйте строку к верхнему регистру.
        String task6 = s.toUpperCase();
        System.out.println("Task 6 UpperCase : " + task6);

        //7 Преобразуйте строку к нижнему регистру.
        String task7 = s.toLowerCase();
        System.out.println("Task 7 LowerCase : " + task7);

        //8 Вырезать строку Java c помощью метода String.substring().
        String task8 = s.substring(s.length()-5, s.length()-1);
        System.out.println("Task 8 Substring : " + task8);
    }

    public static void lastSymbol(String a) {
        System.out.println(a.charAt(a.length()-1));
    }

}
