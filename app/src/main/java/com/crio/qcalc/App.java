/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Starting QCalc..");

       StandardCalculator calc = new StandardCalculator();

       calc.add(1.5, 2.5);

       System.out.println(calc.getResult());


        LogicCalculator calc1 = new LogicCalculator();

        calc1.OR(8, 6);

        calc1.printResult();

    }
}
