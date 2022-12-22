package com.vimemacs.control;

/**
 * @author HWD
 * @date 2022/12/22 10:29
 */
public class TestWithReturn {
    static int test(int testval, int target) {
        if (testval > target)
            return +1;
        if (testval < target)
            return -1;
        return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
