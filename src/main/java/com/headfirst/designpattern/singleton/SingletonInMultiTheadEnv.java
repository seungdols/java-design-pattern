package com.headfirst.designpattern.singleton;

import com.headfirst.designpattern.singleton.old.Singleton;

/**
 * Created by Naver on 2016-07-22.
 */
public class SingletonInMultiTheadEnv {
    //싱글톤 클래스의 유일한 인스턴스를 저장 할 정적 변수
    private volatile static SingletonInMultiTheadEnv uniqueInstance;

    private SingletonInMultiTheadEnv() {
    }
    public static synchronized SingletonInMultiTheadEnv getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonInMultiTheadEnv();
                }
            }
        }
        return uniqueInstance;
    }
}
