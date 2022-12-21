package com.vimemacs.operators;

/**
 * @author HWD
 * @date 2022/12/21 16:05
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i; // 没有必要类型提升
        long lng2 = (long) 200;
        lng = 200;
        // 类型收缩
        i = (int)lng2; // Cast required
    }
}
