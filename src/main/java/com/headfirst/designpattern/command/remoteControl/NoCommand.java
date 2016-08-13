package com.headfirst.designpattern.command.remoteControl;

/**
 * Created by Naver on 2016-07-22.
 */
public class NoCommand implements Command {
//   일종의 Null 객체라 할 수 있다.
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
