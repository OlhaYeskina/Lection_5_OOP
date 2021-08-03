package com.epam.olha_yeskina.java.lecture_5.task_1;

public class Candy {
    private String candyName;
    private int candyWeigh;
    private int candyCost;

    public Candy(){}
    public Candy(String candyName, int candyCost, int candyWeigh) {
        this.candyName = candyName;
        this.candyWeigh = candyWeigh;
        this.candyCost = candyCost;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public int getCandyWeigh() {
        return candyWeigh;
    }

    public void setCandyWeigh(int candyWeigh) {
        this.candyWeigh = candyWeigh;
    }

    public int getCandyCost() {
        return candyCost;
    }

    public void setCandyCost(int candyCost) {
        this.candyCost = candyCost;
    }


    public void outputCandyParameters(){
        System.out.println("Candy name: " + getCandyName()
                + " Candy cost: " + getCandyCost()
                + " Candy weight: " + getCandyWeigh());
    }
}
