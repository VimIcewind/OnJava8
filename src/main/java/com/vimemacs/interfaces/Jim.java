package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 15:39
 */

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
/* Output:
Jim2::jim
*/