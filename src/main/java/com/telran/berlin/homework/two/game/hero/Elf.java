package com.telran.berlin.homework.two.game.hero;

import com.telran.berlin.homework.two.game.constant.Constant;

public class Elf {
    private int id;
    private String name;
    private String surname;
    private int height;
    private int weight;
    private char nick;

    private int power;

    private int charisma;

    private int magic;

    public Elf() { }

    public Elf(int id) {
        this.id = id;
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getNick() {
        return nick;
    }

    public void setNick(char nick) {
        this.nick = nick;
    }

    public int getPower() { return power; }

    public int getCharisma() { return charisma; }

    public int getMagic() { return magic; }
}
