package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 15:05
 */
interface InterfaceWithDefault {
    void firstMethod();
    
    void secondMethod();
    
    default void newMethod() {
        System.out.println("newMethod");
    }
}
