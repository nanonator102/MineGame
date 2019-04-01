package com.nanonator;
import java.util.Scanner;
import com.nanonator.Ore;


public class Main {

    public static void main(String[] args) {
        //ORE LIST 0=Copper, 1=Tin, 2=Iron, 3=Coal
        //BAR LIST 0=Copper, 1=Tin, 2=Bronze 3=Iron 4=Steel
        //SELL PRICE 0=50, 1=50, 2=80, 3=

        Ore oreOne = new Ore("Copper Ore", 32, 25, "Copper ore, one of the oldest metals known to man.");
        oreOne.printInfo();
        Ore oreTwo = new Ore("Tin Ore", 27, 25, "Tin ore. Not very useful by itself but good for alloys.");
        oreTwo.printInfo();
        Bar barOne = new Bar("Copper Bar", 21, 50, "A copper bar, ready to the sent to the blacksmith.");
        barOne.printInfo();
        Bar barTwo = new Bar("Tin Bar", 13, 50, "A tin bar, ready to be sent to the blacksmith.");
        barTwo.printInfo();
        Bar barThree = new Bar("Bronze Bar", 37, 80, "A bronze bar, ready to be sent to the blacksmith.");
        barThree.printInfo();

        boolean exit=false;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while(!exit) {
            System.out.println("What would you like to do? (Valid actions are quit, mine)");
            input=keyboard.nextLine();
            input=input.toLowerCase();
            System.out.println(input);
            if(input.contains("exit") || input.contains("quit") || input.contains("leave")) {
                exit=true;
            }else if(input.contains("mine")) {
                System.out.println("What would you like to mine? (Valid action are copper, tin)");
                input=keyboard.nextLine();
                if(input.contains("copper")) {
                    oreOne.increAmount();
                    oreOne.getAmount();
                }else if(input.contains("tin")) {
                    oreTwo.increAmount();
                    oreTwo.getAmount();
                }
            } else if(input.contains("smelt")) {
                System.out.println("What would you like to smelt? (Valid actions are copper, tin, bronze)");
                input=keyboard.nextLine();
                input=input.toLowerCase();
                if(input.contains("copper")) {
                    if (oreOne.getAmount()>0);
                }
            }

        }
        //Insert save to file function here.


    }
}
