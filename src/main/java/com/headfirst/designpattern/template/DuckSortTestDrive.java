package com.headfirst.designpattern.template;

import java.util.Arrays;

/**
 * Created by Naver on 2016-07-25.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("Seungho1", 6),
            new Duck("Seungho2", 8),
            new Duck("Seungho3", 6),
            new Duck("Seungho4", 7),
            new Duck("Seungho5", 10),
            new Duck("Seungho6", 2)
        };

        System.out.println("정렬 전 : ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After Sorting");
        display(ducks);

    }

    private static void display(Duck[] ducks) {
        for(Duck duck : ducks){
            System.out.println(duck);
        }
    }
}
