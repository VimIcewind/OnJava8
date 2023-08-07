package com.vimemacs.reuse;

/**
 * Constructor calls during inheritance
 * @author HWD
 * @date 2023/8/7 14:23
 */

class Art {
    Art() {
        System.out.println("Arg constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
/* Output:
Arg constructor
Drawing constructor
Cartoon constructor
*/