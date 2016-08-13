package com.headfirst.designpattern.singleton.old;

/**
 * Created by Naver on 2016-07-22.
 */
public class Singleton {
    //싱글톤 클래스의 유일한 인스턴스를 저장 할 정적 변수
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

