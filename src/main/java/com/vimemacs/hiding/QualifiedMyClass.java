package com.vimemacs.hiding;

/**
 * @author HWD
 * @date 2023/1/9 22:14
 */
public class QualifiedMyClass {
    public static void main(String[] args) {
        com.vimemacs.hiding.mypackage.MyClass m = new com.vimemacs.hiding.mypackage.MyClass();
    }
}
