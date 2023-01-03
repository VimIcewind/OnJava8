package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2023/1/3 14:20
 */
// {WillNotCompile}
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        //- f('a', 'b');
        // error: reference to f is ambiguous
        //        f('a', 'b');
        //        ^
        //  both method f(float,Character...) in OverloadingVarargs2 and method f(Character...) in OverloadingVarargs2 match
    }
}
