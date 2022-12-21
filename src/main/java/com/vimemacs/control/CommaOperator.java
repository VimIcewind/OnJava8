package com.vimemacs.control;

/**
 * @author HWD
 * @date 2022/12/21 21:59
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
