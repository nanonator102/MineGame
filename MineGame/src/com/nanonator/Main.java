package com.nanonator;
import java.util.Scanner;

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
        Wood woodOne = new Wood("Oak Log", 11, 10, "A log of oak wood.");
        woodOne.printInfo();
        Wood woodTwo = new Wood("Birch Log", 13, 10, "A log of birch wood.");
        woodTwo.printInfo();
        Wood woodThree = new Wood("Spruce Log", 23, 10, "A log of spruce wood.");
        woodThree.printInfo();
        Wood woodFour = new Wood("Jungle Log", 29, 10, "A log of jungle wood.");
        woodFour.printInfo();

        boolean exit=false;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while(!exit) {
            System.out.println("What would you like to do? (Valid actions are quit, mine, smelt and inspect)");
            input=keyboard.nextLine().toLowerCase();
            System.out.println(input);

            //Checks for initial keyword entry.
            if(input.contains("exit") || input.contains("quit") || input.contains("leave")) {
                exit=true;
            }else if(input.contains("mine")) {
                System.out.println("What would you like to mine? (Valid action are copper, tin)");
                input=keyboard.nextLine();
                if(input.contains("copper")) {
                    oreOne.increAmount();
                    System.out.println(oreOne.getAmount());
                }else if(input.contains("tin")) {
                    oreTwo.increAmount();
                    System.out.println(oreTwo.getAmount());
                }

            //If the keyword is "smelt", go through all options for smelt.
            } else if(input.contains("smelt")) {
                System.out.println("What would you like to smelt? (Valid actions are copper, tin, bronze)");
                input=keyboard.nextLine();
                input=input.toLowerCase();
                if(input.contains("copper")) {
                    if (oreOne.getAmount()>0) {
                        oreOne.decriAmount();
                        barOne.increAmount();
                    }
                }else if(input.contains("tin")) {
                    if(oreTwo.getAmount()>0) {
                        oreTwo.decriAmount();
                        barTwo.increAmount();
                    }
                }else if(input.contains("bronze")) {
                    if(oreOne.getAmount()>0 && oreTwo.getAmount()>0) {
                        oreOne.decriAmount();
                        oreTwo.decriAmount();
                        barOne.increAmount();
                    }
                }else {
                    System.out.println("No keyword detected.");
                }
            //If the keyword is "inspect", go through all options for inspect.
            }else if(input.contains("inspect")) {
                System.out.println("What would you like to inspect? (Valid actions are ore, bar)");
                input=keyboard.nextLine();
                input=input.toLowerCase();
                if(input.contains("ore")) {
                    System.out.println("What ore would you like to inspect? (Valid actions are copper, tin");
                    input=keyboard.nextLine().toLowerCase();
                    if (input.contains("copper")) {
                        oreOne.printInfo();
                    }else if (input.contains("tin")) {
                        oreTwo.printInfo();
                    }
                }else if(input.contains("bar")) {
                    System.out.println("What bar would you like to inspect? (Valid actions are copper, tin, bronze");
                    input=keyboard.nextLine().toLowerCase();
                    if(input.contains("copper")) {
                        barOne.printInfo();
                    }else if(input.contains("tin")) {
                        barTwo.printInfo();
                    }else if(input.contains("bronze")) {
                        barThree.printInfo();
                    }else {
                        System.out.println("No keyword detected.");
                    }
                }else {
                    System.out.println("No keyword detected");
                }
            }else if(input.contains("chop")) {
                System.out.println("What would you like to chop? Valid actions are oak, birch, spruce, jungle");
                input=keyboard.nextLine().toLowerCase();
                if(input.contains("oak")) {
                    woodOne.increAmount();
                }else if(input.contains("birch")) {
                    woodTwo.increAmount();
                }else if(input.contains("spruce")) {
                    woodThree.increAmount();
                }else if(input.contains("jungle")) {
                    woodFour.increAmount();
                }
            }else {
                System.out.println("No keyword detected.");
            }

        }//End of while loop

        //Insert save to file function here.

    }
}
