package com.headfirst.designpattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Naver on 2016-07-25.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("커피에 우유와 설탕을 넣어드릴까요? (y/n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException e){
            System.out.println("IO 오류");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
