package com.vimemacs.interfaces.interfaceprocessor;

/**
 * @author HWD
 * @date 2023/8/17 14:21
 */
public class Applicator {
    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
