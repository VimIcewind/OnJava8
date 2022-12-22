package com.vimemacs.control;

import onjava.*;

/**
 * @author HWD
 * @date 2022/12/22 11:01
 */
public class RandomBounds {
    public static void main(String[] args) {
        new TimedAbort(3);
        switch (args.length == 0 ? "" : args[0]) {
            case "lower":
                while (Math.random() != 0.0)
                    ; // 保持重试
                System.out.println("Produced 0.0!");
                break;
            case "upper":
                while (Math.random() != 1.0)
                    ; // 保持重试
                System.out.println("Produced 1.0!");
                break;
            default:
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower");
                System.out.println("\tRandomBounds upper");
                System.exit(1);
        }
    }
}
