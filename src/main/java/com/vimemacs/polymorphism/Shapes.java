package com.vimemacs.polymorphism;

import com.vimemacs.polymorphism.shape.RandomShapes;
import com.vimemacs.polymorphism.shape.Shape;

/**
 * Polymorhpism in Java
 * @author HWD
 * @date 2023/8/11 11:38
 */
public class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        // Make polymorphic method calls:
        for (Shape shape: gen.array(9)) {
            shape.draw();
        }
    }
}
/* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*/