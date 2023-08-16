package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 15:09
 */
public class Implementation2 implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
/* Output:
firstMethod
secondMethod
newMethod
*/