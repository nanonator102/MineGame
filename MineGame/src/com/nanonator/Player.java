package com.nanonator;

public class Player {
    private int miningXP = 0, woodCuttingXP = 0, slayingXP = 0, smithingXP = 0;
    private String name = "";

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMiningXP() {
        return miningXP;
    }

    public void setMiningXP(int miningXP) {
        this.miningXP = miningXP;
    }

    public int getWoodCuttingXP() {
        return woodCuttingXP;
    }

    public void setWoodCuttingXP(int woodCuttingXP) {
        this.woodCuttingXP = woodCuttingXP;
    }

    public int getSlayingXP() {
        return slayingXP;
    }

    public void setSlayingXP(int slayingXP) {
        this.slayingXP = slayingXP;
    }

    public int getSmithingXP() {
        return smithingXP;
    }

    public void setSmithingXP() {
        this.smithingXP = smithingXP;
    }

    public void printInfo() {
        System.out.println("Your name is " + name + ".");
        System.out.println("You have " + miningXP + " mining xp.");
        System.out.println("You have " + woodCuttingXP + " woodcutting xp.");
        System.out.println("You have " + smithingXP + " smithing xp.");
        System.out.println("You have " + slayingXP + " slaying xp.");
    }


}
