package com.headfirst.designpattern.command.remoteControl;

/**
 * Created by Naver on 2016-07-22.
 */
public class Light {
    String location;
    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
