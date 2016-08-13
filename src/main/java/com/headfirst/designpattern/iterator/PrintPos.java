package com.headfirst.designpattern.iterator;

import java.util.Iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class PrintPos {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public PrintPos(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("init=------------");
        printMenu(pancakeIterator);
        System.out.println("two--------------");
        printMenu(dinerIterator);
    }
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + " -- ");
            System.out.println(item.getDescription());

        }
    }
}
