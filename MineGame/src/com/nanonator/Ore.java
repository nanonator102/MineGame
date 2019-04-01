package com.nanonator;

public class Ore {
    private String name = "", description = "";
    private int amount = 0, worth = 0;

    Ore(String name) {
        this.name = name;
    }
    Ore(String name, int amount, int worth, String description) {
        this.name = name;
        this.amount = amount;
        this.worth = worth;
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void increAmount() {
        amount++;
    }

    public void getAmountText() {
        System.out.println("You have " + amount + " " + name + ".");
    }

    public void printInfo() {
        System.out.println("You have " + amount + " " + name + ".");
        System.out.println("One " + name + " is worth " + worth + ".");
        System.out.println(description);
    }

}
