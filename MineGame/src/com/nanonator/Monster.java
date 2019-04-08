package com.nanonator;

public class Monster {
    private int health = 0, healthMax = 0, coins = 0, coinWorth = 0;
    private String name = "", type = "";

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, String type, int health, int healthMax, int coinWorth) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.healthMax = healthMax;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getCoinWorth() {
        return coinWorth;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Max health: " + healthMax);
        System.out.println("Health: " + health);
    }
}
