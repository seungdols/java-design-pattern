package com.headfirst.designpattern.command;

/**
 * Created by Naver on 2016-07-22.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){

    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
