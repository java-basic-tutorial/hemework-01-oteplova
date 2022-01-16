package com.softserveinc;

import java.util.Scanner;
import java.lang.Math;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println(" Write how many ml of water the coffee machine has:");
        System.out.print(">>>");
        int enteredWater = scanner.nextInt();

        System.out.println(" Write how many ml of milk the coffee machine has:");
        System.out.print(">>>");
        int enteredMilk = scanner.nextInt();

        System.out.println(" Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>>");
        int enteredCofeeBeans = scanner.nextInt();

        System.out.println(" Write how many cups of coffee you will need:");
        System.out.print(">>>");
        int enteredCups = scanner.nextInt();

        int minNumberOfCup = Math.min(Math.min(enteredWater/200,enteredMilk/50),enteredCofeeBeans/15);
        if(enteredCups<=minNumberOfCup){
            if(enteredCups-minNumberOfCup !=0){
                System.out.println(" Yes, I can make that amount of coffee (and even " + (minNumberOfCup-enteredCups) + " more than that)");
            }else {
                System.out.println(" Yes, I can make that amount of coffee");
            }
        } else {
            System.out.println(" No, I can make only " + minNumberOfCup + " cup(s) of coffee");
        }
    }
}