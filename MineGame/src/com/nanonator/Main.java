package com.nanonator;
import java.util.Scanner;
import com.nanonator.Ore;


public class Main {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        //ORE LIST 0=Copper, 1=Tin, 2=Iron, 3=Coal
        //BAR LIST 0=Copper, 1=Tin, 2=Bronze 3=Iron 4=Steel
        //SELL PRICE 0=50, 1=50, 2=80, 3=

        Ore oreOne = new Ore("Copper Ore");
        oreOne.setAmount(32);
        oreOne.getAmount();
        oreOne.setWorth(50);
        oreOne.setDescription("Copper ore, one of the oldest metals known to man.");
        oreOne.printInfo();


    }
}
