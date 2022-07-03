package com.telran.berlin.homework.two.game.hero;

import com.telran.berlin.homework.two.game.constant.Constant;

public class Ork {
    private int id;
    private String name;
    private String surname;
    private int height;
    private int weight;
    private char nick;

    private int power;
    private int charisma;
    private int magic;

    public Ork(int id) {
        this.id = id;
        this.power = Constant.ORK_POWER;
        this.charisma = Constant.ORK_CHARISMA;
        this.magic = Constant.ORK_MAGIC;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() { return height; }

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
