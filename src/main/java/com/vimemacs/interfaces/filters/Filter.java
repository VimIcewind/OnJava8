package com.vimemacs.interfaces.filters;

/**
 * @author HWD
 * @date 2023/8/17 14:08
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    
    public Waveform process(Waveform input) {
        return input;
    }
}
