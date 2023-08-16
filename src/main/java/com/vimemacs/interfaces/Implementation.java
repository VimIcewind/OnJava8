package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 11:03
 */
interface Concept {
    void idea1();
    void idea2();
}

class Implementation implements Concept {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}
