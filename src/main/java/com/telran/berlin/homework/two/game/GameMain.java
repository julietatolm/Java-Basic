package com.telran.berlin.homework.two.game;
import com.telran.berlin.homework.two.game.hero.Elf;
import com.telran.berlin.homework.two.game.hero.Ork;

public class GameMain {
    public static void main(String[] args) {
        Elf elf1 = new Elf(1);
        System.out.println("Elf id: " + elf1.getId());
        System.out.println("Power Elf1 id:" + elf1.getId() + " = " + elf1.getPower());

        Ork ork1 = new Ork(1);
        System.out.println("Ork id: " + ork1.getId());
        System.out.println("Power Ork1 id:" + ork1.getId() + " = " + ork1.getPower());
    }
}
