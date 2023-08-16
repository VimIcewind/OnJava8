package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 14:55
 */
public class AnImplementation implements AnInterface {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}
/* Output:
firstMethod
secondMethod
*/