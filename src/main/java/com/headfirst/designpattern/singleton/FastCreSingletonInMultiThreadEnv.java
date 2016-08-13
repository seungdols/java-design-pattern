package com.headfirst.designpattern.singleton;

/**
 * Created by Naver on 2016-07-22.
 */
public class FastCreSingletonInMultiThreadEnv {
    //싱글톤 클래스의 유일한 인스턴스를 저장 할 정적 변수
    private volatile static FastCreSingletonInMultiThreadEnv uniqueInstance = new FastCreSingletonInMultiThreadEnv();

    private FastCreSingletonInMultiThreadEnv() {
    }

    public static synchronized FastCreSingletonInMultiThreadEnv getInstance() {

        return uniqueInstance;
    }
}
