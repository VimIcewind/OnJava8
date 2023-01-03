package com.vimemacs.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HWD
 * @date 2023/1/3 13:08
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
