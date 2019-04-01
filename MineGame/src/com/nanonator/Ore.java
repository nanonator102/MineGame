package com.nanonator;

public class Ore {
    String name;
    int amount = 0;
    int worth = 0;
    String description = "";

    public Ore(String name) {
        this.name = name;
    }

    public void setAmount(int oreAmount) {
        amount = oreAmount;
    }

    public void getAmount() {
        System.out.println("You have " + amount + " " + name + ".");
    }

    public void setWorth(int oreWorth) {
        worth = oreWorth;
    }

    public void setDescription(String oreDescription) {
        description = oreDescription;
    }

    public void printInfo() {
        System.out.println("You have " + amount + " " + name + ".");
        System.out.println(name + " is worth " + worth + ".");
        System.out.println(description);
    }

}
