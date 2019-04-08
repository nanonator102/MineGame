package com.nanonator;
import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        //ORE LIST 0=Copper, 1=Tin, 2=Iron, 3=Coal
        //BAR LIST 0=Copper, 1=Tin, 2=Bronze 3=Iron 4=Steel
        //SELL PRICE 0=50, 1=50, 2=80, 3=
        //TimerTask tTask = new TimerTask();

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
        Monster monsterOne = new Monster("Zombie", "Undead", 5, 5, 10);
        monsterOne.printInfo();
        Monster monsterTwo = new Monster("Skeleton", "Undead", 5, 5, 15);
        monsterTwo.printInfo();
        Monster monsterThree = new Monster("Spider", "Arthropod", 4, 4, 15);
        monsterThree.printInfo();
        Tool swordOne = new Tool("Wooden Sword", "sword", 2);
        swordOne.printInfo();
        Tool swordTwo = new Tool("Copper Sword", "sword", 4);
        swordTwo.printInfo();
        Tool swordThree = new Tool("Bronze Sword", "sword", 6);
        swordThree.printInfo();
        Tool pickaxeOne = new Tool("Wooden Pickaxe", "pickaxe", 2);
        pickaxeOne.printInfo();
        Tool pickaxeTwo = new Tool("Copper Pickaxe", "pickaxe", 4);
        pickaxeTwo.printInfo();
        Tool pickaxeThree = new Tool("Bronze Pickaxe", "pickaxe", 6);
        pickaxeThree.printInfo();
        Tool axeOne = new Tool("Wooden Axe", "axe", 2);
        axeOne.printInfo();
        Tool axeTwo = new Tool("Copper Axe", "axe", 4);
        axeTwo.printInfo();
        Tool axeThree = new Tool("Bronze Axe", "axe", 6);
        axeThree.printInfo();
        Player player = new Player();

        //Thread Timer = new Thread(new GameTimer());
        //Timer.start();

        boolean exit=false, blacksmithOwned=false, areanaOwned=false;
        int money = 0, sellAmount = 0;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while(!exit) {
            System.out.println("What would you like to do? (Valid actions are quit, mine, smelt, inspect, sell and balance.b)");
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
            }else if(input.contains("sell")) {
                System.out.println("What would you like to sell? (Valid actions are ore, bar, wood, monster coin)");
                input = keyboard.nextLine().toLowerCase();
                if(input.contains("ore")) {
                    System.out.println("What ore would you like to sell? (Valid actions are copper, tin)");
                    input = keyboard.nextLine().toLowerCase();
                    if(input.contains("copper")) {
                        System.out.println("How much copper ore would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(oreOne.getAmount()>=sellAmount) {
                            money = money + (sellAmount * oreOne.getWorth());
                            oreOne.setAmount((oreOne.getAmount() - sellAmount));
                        } else {
                            System.out.println("You do not have enough copper ore!");
                        }
                    }else if(input.contains("tin")) {
                        System.out.println("How much tin ore would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(oreTwo.getAmount()>=sellAmount) {
                            money = money + (sellAmount * oreTwo.getWorth());
                            oreTwo.setAmount((oreTwo.getAmount() - sellAmount));
                        }else {
                            System.out.println("You do not have enough tin ore!");
                        }
                    }
                } else if(input.contains("bar")) {
                    System.out.println("What bar would you like to sell? (Valid actions are copper, tin, bronze");
                    input = keyboard.nextLine().toLowerCase();
                    if(input.contains("copper")) {
                        System.out.println("How many copper bars would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(barOne.getAmount()>=sellAmount) {
                            money = money + (sellAmount * barOne.getWorth());
                            barOne.setAmount((barOne.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough copper bars!");
                        }
                    }else if(input.contains("tin")) {
                        System.out.println("How many tin bars would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(barTwo.getAmount()>=sellAmount) {
                            money = money + (sellAmount * barTwo.getWorth());
                            barTwo.setAmount((barTwo.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough tin bars!");
                        }
                    }else if(input.contains("bronze")) {
                        System.out.println("How many bronze bars would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(barThree.getAmount()>=sellAmount) {
                            money = money + (sellAmount * barThree.getWorth());
                            barThree.setAmount((barThree.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough bronze bars!");
                        }
                    } else {
                        System.out.println("No keyword detected!");
                    }
                }else if(input.contains("wood")) {
                    System.out.println("What wood would you like to sell? (Valid actions are oak, birch, spruce and jungle");
                    input=keyboard.nextLine().toLowerCase();
                    if(input.contains("oak")) {
                        System.out.println("How many oak logs would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(woodOne.getAmount()>=sellAmount) {
                            money = money + (sellAmount * woodOne.getWorth());
                            woodOne.setAmount((woodOne.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough oak logs!");
                        }
                    }else if(input.contains("birch")) {
                        System.out.println("How many birch logs would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(woodTwo.getAmount()>=sellAmount) {
                            money = money + (sellAmount * woodTwo.getWorth());
                            woodTwo.setAmount((woodTwo.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough birch logs!");
                        }
                    }else if(input.contains("spruce")) {
                        System.out.println("How many spruce logs would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(woodThree.getAmount()>=sellAmount) {
                            money = money + (sellAmount * woodThree.getWorth());
                            woodThree.setAmount((woodThree.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough spruce logs!");
                        }
                    }else if(input.contains("jungle")) {
                        System.out.println("How many jungle logs would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(woodFour.getAmount()>=sellAmount) {
                            money = money + (sellAmount * woodFour.getWorth());
                            woodFour.setAmount((woodFour.getAmount()-sellAmount));
                        }else {
                            System.out.println("You do not have enough jungle logs!");
                        }
                    }

                }else if(input.contains("monster coin")) {
                    System.out.println("What monster coins would you like to sell? (Zombie, Skeleton, Spider");
                    input = keyboard.nextLine().toLowerCase();
                    if(input.contains("zombie")) {
                        System.out.println("How many zombie coins would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(monsterOne.getCoins()>=sellAmount) {
                            money = money + (sellAmount * monsterOne.getCoinWorth());
                            monsterOne.setCoins((monsterOne.getCoins()-sellAmount));
                        } else {
                            System.out.println("You do not have enough zombie coins!");
                        }
                    } else if(input.contains("skeleton")) {
                        System.out.println("How many skeleton coins would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(monsterTwo.getCoins()>=sellAmount) {
                            money = money + (sellAmount * monsterTwo.getCoinWorth());
                            monsterTwo.setCoins((monsterTwo.getCoins()-sellAmount));
                        } else {
                            System.out.println("You do not have enough skeleton coins!");
                        }
                    } else if(input.contains("spider")) {
                        System.out.println("How many spider coins would you like to sell?");
                        sellAmount = Integer.parseInt(keyboard.nextLine());
                        if(monsterThree.getCoins()>=sellAmount) {
                            money = money + (sellAmount * monsterThree.getCoinWorth());
                            monsterThree.setCoins((monsterThree.getCoins()-sellAmount));
                        } else {
                            System.out.println("You do not have enough spider coins!");
                        }
                    } else {
                        System.out.println("No keyword detected.");
                    }

                } else {
                System.out.println("No keyword detected.");
            }
            }else if(input.contains("balance")){
                System.out.println("You have " + money + " coins.");
            }else if(input.contains("monster")) {
                System.out.println("What would you like to do with the monsters? (Valid actions are attack, inspect");
                input=keyboard.nextLine().toLowerCase();
                if(input.contains("attack")) {
                    System.out.println("Which monster would you like to attack? (Zombie, Skeleton, Spider");
                    input=keyboard.nextLine().toLowerCase();
                    if(input.contains("zombie")) {

                    }else if(input.contains("skeleton")) {

                    }else if(input.contains("spider")) {

                    }else {
                        System.out.println("No keyword detected.");
                    }

                }else if(input.contains("inspect")) {
                    System.out.println("Which monster would you like to inspect? (Zombie, Skeleton, Spider)");
                    input = keyboard.nextLine().toLowerCase();
                    if(input.contains("zombie")) {
                        monsterOne.printInfo();
                    }else if(input.contains("skeleton")) {
                        monsterTwo.printInfo();
                    }else if(input.contains("spider")) {
                        monsterThree.printInfo();
                    }else {
                        System.out.println("No keyword detected.");
                    }

                }
            } else{//End of task checker.
                System.out.println("No keyword detected.");
            }

            //GameTimer.printAmount(5);

        }//End of while loop

        //Insert save to file function here.

    }
}
