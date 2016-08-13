package com.headfirst.designpattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Naver on 2016-07-25.
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void brew(){
        System.out.println("차를 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가 하는 중");
    }

}
