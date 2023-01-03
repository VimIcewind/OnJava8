package com.vimemacs.housekeeping;

/**
 * Using array syntax to create variable argument lists
 *
 * @author HWD
 * @date 2023/1/3 13:37
 */

class A {}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47, (float) 3.14, 11.11});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});

    }
}
