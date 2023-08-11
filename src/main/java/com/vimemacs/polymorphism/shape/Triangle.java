package com.vimemacs.polymorphism.shape;

/**
 * @author HWD
 * @date 2023/8/11 11:31
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
