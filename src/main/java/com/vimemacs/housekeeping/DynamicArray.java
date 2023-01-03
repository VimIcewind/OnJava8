package com.vimemacs.housekeeping;

/**
 * @author HWD
 * @date 2023/1/3 13:25
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});

    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}
