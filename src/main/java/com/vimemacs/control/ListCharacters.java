package com.vimemacs.control;

/**
 * @author HWD
 * @date 2022/12/21 21:56
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int)c + " character: " + c);
    }
}
