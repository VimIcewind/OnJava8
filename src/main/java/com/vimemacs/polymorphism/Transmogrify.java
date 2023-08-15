package com.vimemacs.polymorphism;

import javax.print.attribute.HashPrintJobAttributeSet;

/**
 * Dynamically changing the behavior of an object
 * via composition (the "State" design pattern)
 * @author HWD
 * @date 2023/8/15 11:16
 */

class Actor {
    public void act() {
        
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    
    public void change() {
        actor = new SadActor();
    }
    
    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
/* Output:
HappyActor
SadActor
*/