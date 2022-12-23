package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2022/12/23 21:32
 */
public class MethodInit3 {
    //- int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
