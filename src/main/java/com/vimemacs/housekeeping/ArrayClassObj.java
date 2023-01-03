package com.vimemacs.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HWD
 * @date 2023/1/3 13:16
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(a));
    }
}
