package com.nanonator;

public class Bar {
    String name;
    int amount = 0;
    int worth = 0;
    String description = "";

    Bar(String name) {
        this.name = name;
    }

    Bar(String name, int amount, int worth, String description) {
        this.name = name;
        this.amount = amount;
        this.worth = worth;
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void getAmountText() {
        System.out.println("You have " + amount + " " + name + ".");
    }

    public void increAmount() {
        amount++;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWorth() {
        return worth;
    }

    public void printInfo() {
        System.out.println("You have " + amount + " " + name + ".");
        System.out.println("One " + name + " is worth " + worth + ".");
        System.out.println(description);
    }
}
