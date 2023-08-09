package com.vimemacs.reuse;

/**
 * Makding an entire class final
 * @author HWD
 * @date 2023/8/9 15:21
 */

class SmallBrain {
    
}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    
    void f() {
        
    }
}

//- class Further extends Dinosaur {}
// error: Cannot extends final class 'Dinosaur'

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
