package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 15:48
 */
public interface Operations {
    void execute();
    
    static void runOps(Operations... ops) {
        for (Operations op : ops) {
            op.execute();
        }
    }
    
    static void show(String msg) {
        System.out.println(msg);
    }
}
