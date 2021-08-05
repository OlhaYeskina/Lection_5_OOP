package com.epam.olha_yeskina.java.lecture_5.task_1;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет.
 * Собрать детский подарок с определением его веса.
 * Провести сортировку конфет в подарке на основе одного из параметров.
 * Найти конфету в подарке, соответствующую заданному диапазону параметров.
 */

public class NewYearsGift {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Alenka1", 15, 50);
        Candy candy2 = new Candy("Alenka3", 20, 50);
        Candy candy3 = new ToppingCandy("Alenka2", 43, 50, "Chocolate");
        Gift newYearGift = new Gift();
        newYearGift.addCandyToGift(candy1);
        newYearGift.addCandyToGift(candy2);
        newYearGift.addCandyToGift(candy3);
        newYearGift.outputGiftInformation();
        newYearGift.outputGiftCandysInformation();
        newYearGift.sortingCandys();
        System.out.println("After sorting: ");
        newYearGift.outputGiftCandysInformation();
        newYearGift.findCandyByCost(43);

    }
}
