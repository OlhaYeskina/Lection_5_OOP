package com.epam.olha_yeskina.java.lecture_5.task_1;

public class ToppingCandy extends Candy{


    public ToppingCandy(String candyName, int candyCost, int candyWeigh, String topping) {
        super(candyName, candyCost, candyWeigh);
        this.topping = topping;
    }

    private String topping;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public void outputCandyParameters(){
        System.out.println("Candy name: " + getCandyName()
                + " Candy cost: " + getCandyCost()
                + " Candy weight: " + getCandyWeigh()
                + " Topping: " + topping);
    }
}
