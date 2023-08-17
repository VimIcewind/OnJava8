package com.vimemacs.interfaces.filters;

/**
 * @author HWD
 * @date 2023/8/17 14:07
 */

public class Waveform {
    private static long counter;
    private final long id = counter++;
    
    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
