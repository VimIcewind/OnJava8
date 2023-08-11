package com.vimemacs.polymorphism.shape;

/**
 * @author HWD
 * @date 2023/8/11 11:28
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
