package com.telran.berlin.homework.extrahomework;

import com.telran.berlin.homework.two.game.hero.Elf;
import com.telran.berlin.homework.two.game.hero.Ork;

public class FactoryHero {

    static int currentId = 0;
    static Elf[] arrayElf = new Elf[1000];
    static int elfCounter = 0;
    static Ork[] arrayOrk = new Ork[1000];
    static int orkCounter = 0;

    public static void main(String[] args) {
        createElf(3);
        createOrk(3);
        System.out.println(currentId);
    }

    public static void createElf(int count) {
        for(int i = 0; i < count; i++) {
            arrayElf[elfCounter] = new Elf(generateId());
            elfCounter++;
        }
    }

    public static void createOrk(int count) {
        for(int i = 0; i < count; i++) {
            arrayOrk[orkCounter] = new Ork(generateId());
            orkCounter++;
        }
    }

    public static int generateId () {
        currentId++;
        return currentId;
    }

    public static Elf[] getArrayElf() { return arrayElf; }

    public static Ork[] getArrayOrk() { return arrayOrk; }
}
