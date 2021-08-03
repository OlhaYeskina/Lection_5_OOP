package com.epam.olha_yeskina.java.lecture_5.task_1;

import java.util.*;

public class Gift implements GiftInterface, Comparator<Candy> {


    private int giftWeight;
    public ArrayList<Candy> candys;

    public Gift() {

        this.candys = new ArrayList<Candy>();
    }

    public int getGiftWeight() {
        return calculateGiftWeight();
    }

    public void outputGiftInformation() {
        System.out.println("Gift weight: " + getGiftWeight());
    }

    public void addCandyToGift(Candy candy) {
        candys.add(candy);
    }

    public void outputGiftCandysInformation() {
        for (Candy candy : this.candys)
            candy.outputCandyParameters();
    }

    public void sortingCandys() {
        Collections.sort(candys, new Gift());
    }

    public void findCandyByCost(int cost){
        Candy foundCandy = new Candy();
        for (Candy candy : this.candys) {
            if(candy.getCandyCost()==cost)
                foundCandy = candy;
        }
        System.out.println("Found candy by cost " + cost + ": ");
        foundCandy.outputCandyParameters();
    }

    @Override
    public int calculateGiftWeight() {
        for (Candy candy : this.candys) {
            giftWeight = giftWeight + candy.getCandyWeigh();
        }

        return giftWeight;
    }

    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getCandyName().compareTo(o2.getCandyName());
    }

//    @Override
//    public Comparator<Candy> reversed() {
//        return null;
//    }
}
