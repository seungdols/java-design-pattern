package com.headfirst.designpattern.iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        PrintPos printPos = new PrintPos(pancakeHouseMenu, dinerMenu);
        printPos.printMenu();
    }
}
