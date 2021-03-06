package com.headfirst.designpattern.command.remoteControl;



/**
 * Created by Naver on 2016-07-22.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
