package com.vimemacs.functional;

/**
 * @author HWD
 * @date 2023/3/4 20:23
 */

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}

public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(
                () -> System.out.println("labmda")
        ).start();

        new Thread(Go::go).start();
    }
}
