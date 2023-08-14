package com.vimemacs.polymorphism;

/**
 * Trying to override a private method
 * @author HWD
 * @date 2023/8/14 10:25
 */
public class PrivateOverride2 {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride2 po = new Derived2();
        po.f();
    }
}

class Derived2 extends PrivateOverride2 {
    //! @Override // method does not override or implement a method from a supertype
    public void f() {
        System.out.println("public f()");
    }
}