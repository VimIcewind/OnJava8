package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 10:26
 */

abstract class Uninstantiable {
    abstract void f();
    abstract int g();
}

public class Instantiable extends Uninstantiable {
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }
}
