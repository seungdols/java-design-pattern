package com.headfirst.designpattern.command.remoteControl;

/**
 * Created by Naver on 2016-07-22.
 */
public interface Command {
    public void execute();
    public void undo();
}
