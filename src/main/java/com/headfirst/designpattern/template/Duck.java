package com.headfirst.designpattern.template;

/**
 * Created by Naver on 2016-07-25.
 */
public class Duck implements Comparable {

    String name;
    int weight;
    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name + ", 체중: + " + weight;
    }
    @Override
    public int compareTo(Object object) {
        Duck duck = (Duck)object;
        if(this.weight < duck.weight)
            return  -1;
        else if(this.weight == duck.weight){
            return 0;
        }else {
            return 1;
        }
    }
}
