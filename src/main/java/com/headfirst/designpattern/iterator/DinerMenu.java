package com.headfirst.designpattern.iterator;

import java.util.*;
import java.util.Iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("이터레이터 패턴5", "이터레이터 패턴 공부하자", true, 2.99);
        addItem("이터레이터 패턴6", "이터레이터 패턴 공부하자", false, 3.99);
        addItem("이터레이터 패턴7", "이터레이터 패턴 공부하자", false, 4.99);
        addItem("이터레이터 패턴8", "이터레이터 패턴 공부하자", true, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Size Full");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }


}
