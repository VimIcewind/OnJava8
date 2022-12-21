package com.vimemacs.operators;

/**
 * @author HWD
 * @date 2022/12/21 09:50
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
