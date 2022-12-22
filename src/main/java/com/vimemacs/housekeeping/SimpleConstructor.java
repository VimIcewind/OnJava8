package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2022/12/22 11:24
 */
class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
