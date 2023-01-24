package com.vimemacs.hiding;

/**
 * @author HWD
 * @date 2023/1/24 21:06
 */
class Sundea {
    private Sundea() {}

    static Sundea makeASundea() {
        return new Sundea();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //- Sundea x = new Sundea();
        Sundea x = Sundea.makeASundea();
    }
}
