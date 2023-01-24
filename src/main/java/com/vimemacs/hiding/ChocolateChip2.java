package com.vimemacs.hiding;

import com.vimemacs.hiding.cookie2.*;

/**
 * Can't use package-access member from another package
 * @author HWD
 * @date 2023/1/24 21:45
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
