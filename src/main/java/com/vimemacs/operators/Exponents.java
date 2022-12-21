package com.vimemacs.operators;

/**
 * @author HWD
 * @date 2022/12/21 14:27
 */
public class Exponents {
    public static void main(String[] args) {
        // "e" 表示 10 的几次幂 大写 E 和 小写 e 的效果相同
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' 是可选的
        double expDouble2 = 47e47; // 自动转换为 double
        System.out.println(expDouble);
    }
}
