package com.vimemacs.interfaces.interfaceprocessor;

/**
 * @author HWD
 * @date 2023/8/17 14:20
 */
public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }
    
    Object process(Object input);
}
