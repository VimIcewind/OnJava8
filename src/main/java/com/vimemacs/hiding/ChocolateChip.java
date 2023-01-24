package com.vimemacs.hiding;

import com.vimemacs.hiding.dessert.Cookie;

/**
 * Can't use package-access member from another package
 * @author HWD
 * @date 2023/1/24 21:45
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //- bite(); Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
