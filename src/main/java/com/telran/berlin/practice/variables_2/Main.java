package com.telran.berlin.practice.variables_2;

public class Main {
    public static void main(String[] args) {
       // VariablesMain.main2();
        //       VariablesMain.var = 10;
        //        System.out.println(VariablesMain.var);

        System.out.println("static var = " + VariablesMain.getVar());

        VariablesMain variable1 = new VariablesMain();
        variable1.setVar2(3);
        System.out.println("static var2 variable1 = " + variable1.getVar2());
        System.out.println("static var variable1 = " + VariablesMain.getVar());

        VariablesMain variable2 = new VariablesMain();
        System.out.println("static var2 variable2 = " + variable2.getVar2());
        System.out.println("static var variable2 = " + VariablesMain.getVar());

    }
}
