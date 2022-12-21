package com.vimemacs.operators;

/**
 * @author HWD
 * @date 2022/12/21 17:07
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
