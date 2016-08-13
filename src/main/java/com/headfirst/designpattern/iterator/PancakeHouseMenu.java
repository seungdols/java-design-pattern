package com.headfirst.designpattern.iterator;

import java.util.*;
import java.util.Iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class PancakeHouseMenu implements Menu{
    List menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("이터레이터 패턴1", "이터레이터 패턴 공부하자", true, 2.99);
        addItem("이터레이터 패턴2", "이터레이터 패턴 공부하자", false, 3.99);
        addItem("이터레이터 패턴3", "이터레이터 패턴 공부하자", false, 4.99);
        addItem("이터레이터 패턴4", "이터레이터 패턴 공부하자", true, 5.99);
    }
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


//    public List getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
