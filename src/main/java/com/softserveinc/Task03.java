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
        int needWater = enteredCups * 200;
        int needMilk = enteredCups * 50;
        int needCoffeBeans = enteredCups * 15;
        int extraWater;
        int extraMilk;
        int extraCoffeBeans;
        int extraCup;
        if (needWater <= enteredWater && needMilk <= enteredMilk && needCoffeBeans <= enteredCofeeBeans) {
            if ((enteredWater - needWater) >= 200 && (enteredMilk - needMilk) >= 50 && (enteredCofeeBeans - needCoffeBeans) >= 15){
                extraWater = (enteredWater - needWater) / 200;
                extraMilk = (enteredMilk - needMilk) / 50;
                extraCoffeBeans = (enteredCofeeBeans - needCoffeBeans) / 15;
                extraCup = Math.min(Math.min(extraWater, extraMilk), extraCoffeBeans);
                System.out.println(" Yes, I can make that amount of coffee (and even " + extraCup + " more than that)");
            } else {
                System.out.println(" Yes, I can make that amount of coffee");
            }
        } else {
            extraWater = enteredWater / 200;
            extraMilk = enteredMilk / 50;
            extraCoffeBeans = enteredCofeeBeans / 15;
            extraCup = Math.min(Math.min(extraWater, extraMilk), extraCoffeBeans);
            System.out.println(" No, I can make only " + extraCup + " cup(s) of coffee");
        }
    }
}