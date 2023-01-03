package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2023/1/3 14:54
 */
public class OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
