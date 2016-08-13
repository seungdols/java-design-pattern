package com.headfirst.designpattern.component;

/**
 * Created by Naver on 2016-07-26.
 */
public class POS {
    MenuComponent allMenus;
    public POS(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
