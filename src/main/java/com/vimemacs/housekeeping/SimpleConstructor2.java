package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2022/12/22 11:24
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}
