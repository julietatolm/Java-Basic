package com.telran.berlin.practice.variables_2;

public class VariablesMain {

    public static int var = 7;
    public int var2 = 5;

    public static void main2() {
        Variable variable = new Variable();
        variable.main1();
        variable.setVar2(5);
    }

    public void main3() {
        int abc = 3;
        System.out.println("abc: " + abc);
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public static int getVar() {
        return var;
    }

    public static void setVar(int var) {
        VariablesMain.var = var;
    }
}
