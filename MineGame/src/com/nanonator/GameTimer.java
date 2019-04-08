package com.nanonator;
public class GameTimer implements Runnable {
    private int i = 0;
            public void run() {
                try
                {
                    // Displaying the thread that is running
                    System.out.println ("Thread " +
                            Thread.currentThread().getId() +
                            " is running");
                        Ore oreFive = new Ore("TestOre");
                        System.out.println(oreFive.getAmount());


                }
                catch (Exception e)
                {
                    // Throwing an exception
                    System.out.println ("Exception is caught");
                }
            }

        }

        /*private int iterations;
    private String name;

    public GameTimer(String name) {
        this.name = name;
    }

    public int printAmount(int iterations) {
        this.iterations = iterations;
        //while(1<iterations) {
            //System.out.println(oreOne.getAmount);*/

