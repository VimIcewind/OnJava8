package com.vimemacs.polymorphism.shape;

/**
 * @author HWD
 * @date 2023/8/11 11:30
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
