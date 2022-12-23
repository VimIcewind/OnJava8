package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2022/12/23 21:31
 */
public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
