package com.nanonator;

public class Tool {
    private String name = "", type = "";
    private int damage = 0;

    public Tool(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void printInfo() {
        System.out.println("This is a " + name + ".");
        System.out.println("It is a " + type + ".");
        System.out.println("It does " + damage + " damage.");
    }

}
