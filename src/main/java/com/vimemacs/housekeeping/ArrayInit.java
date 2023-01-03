package com.vimemacs.housekeeping;

import java.util.Arrays;

/**
 * @author HWD
 * @date 2023/1/3 13:22
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                1, 2, 3, // Autoboxing
        };
        Integer[] b = new Integer[] {
                1, 2, 3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
