package com.softserveinc;

/*
    Task: Write the program that prints all lines as in the example below:

    Starting to make a coffee
    Grinding coffee beans
    Boiling water
    Mixing boiled water with crushed coffee beans
    Pouring coffee into the cup
    Pouring some milk into the cup
    Coffee is ready!
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Write your code here
/*        // variant#1

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
*/

        //variant#2
        System.out.print("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

/*        //variant#3

        String[] makeCoffeProgramm = {"Starting to make a coffee","Grinding coffee beans","Boiling water","Mixing boiled water with crushed coffee beans","Pouring coffee into the cup", "Pouring some milk into the cup","Coffee is ready!"};
        for (String strTemp : makeCoffeProgramm) {
            System.out.println(strTemp);
        }*/
    }
}