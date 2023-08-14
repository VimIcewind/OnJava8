package com.vimemacs.polymorphism;

/**
 * Trying to override a private method
 * @author HWD
 * @date 2023/8/14 10:25
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
/* Output:
private f()
*/