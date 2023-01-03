package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2023/1/3 15:19
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
